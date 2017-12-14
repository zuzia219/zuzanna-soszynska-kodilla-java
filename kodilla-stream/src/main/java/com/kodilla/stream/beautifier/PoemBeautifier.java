package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String decoration, String toBeDecorated, PoemDecorator poemDecorator) {

        String decoratedString = poemDecorator.decorate(decoration, toBeDecorated);
        System.out.println("The String after decoration: " + decoratedString);

        return decoratedString;
    }
}
