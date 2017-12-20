package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {

            fileLines.forEach(System.out::println);

        } catch (IOException e) {

            System.out.println("Oh no! Something went wrong!! Error" + e);

        } finally {

            System.out.println("I am gonna be here...always!");

        }
    }
}
