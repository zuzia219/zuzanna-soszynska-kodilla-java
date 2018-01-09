package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.addTaskTotheList("kill the wolf");
        inProgressList.addTaskTotheList("take the basket to grandma");
        doneList.addTaskTotheList("pass through the forest");

        //When
        String toDoTask = toDoList.getTaskFromTheList(0);
        String inProgressTask = inProgressList.getTaskFromTheList(0);
        String doneTask = doneList.getTaskFromTheList(0);

        //Then
        Assert.assertEquals("kill the wolf", toDoTask);
        Assert.assertEquals("take the basket to grandma", inProgressTask);
        Assert.assertEquals("pass through the forest", doneTask);
    }
}
