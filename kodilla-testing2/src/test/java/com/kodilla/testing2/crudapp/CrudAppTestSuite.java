package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://zuzia219.github.io";
    private WebDriver webDriver;
    private Random generator;


    @Before
    public void initTest() {
        webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        webDriver.close();
    }


    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASKNAME = "//form[contains(@action, \"createTask\")]//fieldset[1]/input";
        final String XPATH_TASKCONTENT = "//form[contains(@action, \"createTask\")]//fieldset[2]/textarea";
        final String XPATH_ADDCARD = "//form[contains(@action, \"createTask\")]//fieldset[3]/button";
        String taskName = "Task Number " + generator.nextInt();
        String taskContent = taskName + " content";

        WebElement name = webDriver.findElement(By.xpath(XPATH_TASKNAME));
        name.sendKeys(taskName);

        WebElement content = webDriver.findElement(By.xpath(XPATH_TASKCONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = webDriver.findElement(By.xpath(XPATH_ADDCARD));
        addButton.click();

        Thread.sleep(2000);

        return taskName;
    }

    private void deleteCrudTestTask(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        webDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteButton = theForm.findElement(By.xpath(".//button[contains(@type, \"task-delete\")]"));
                    deleteButton.click();
                });


        Thread.sleep(2000);
    }

    private void sentTestTaskToTrello(String taskName) throws InterruptedException {
        webDriver.navigate().refresh();

        while (!webDriver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        webDriver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement createButton =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    createButton.click();
                });

        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("zuzannasoszynska");
        driverTrello.findElement(By.id("password")).sendKeys("trellopaswordfortests");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//span[@title=\"Kodilla Application\"]")).size() > 0)
                .forEach(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span[contains(@class, \"list-card-title\")]")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sentTestTaskToTrello(taskName);
        Assert.assertTrue(checkTaskExistsInTrello(taskName));
        deleteCrudTestTask(taskName);
    }
}


