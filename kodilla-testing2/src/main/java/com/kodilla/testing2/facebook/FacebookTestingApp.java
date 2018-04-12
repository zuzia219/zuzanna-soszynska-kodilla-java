package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String WAIT_FOR_1 = "//select[1]";
    public static final String WAIT_FOR_2 = "//select[2]";
    public static final String WAIT_FOR_3 = "//select[3]";

    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        while (!driver.findElement(By.xpath(WAIT_FOR_1)).isDisplayed()) ;

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(3);

        while (!driver.findElement(By.xpath(WAIT_FOR_2)).isDisplayed()) ;

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(10);

        while (!driver.findElement(By.xpath(WAIT_FOR_3)).isDisplayed()) ;

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(8);
    }
}
