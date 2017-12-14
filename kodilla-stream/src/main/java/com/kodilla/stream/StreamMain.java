package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ABC", "PoemTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated + decoration));
        poemBeautifier.beautify("", "PoemTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toUpperCase()));
        poemBeautifier.beautify("***", "PoemTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.toLowerCase() + decoration));
        poemBeautifier.beautify("&", "PoemTitle", ((decoration, toBeDecorated) -> decoration + toBeDecorated.replace('T', 't') + decoration));
    }
}
