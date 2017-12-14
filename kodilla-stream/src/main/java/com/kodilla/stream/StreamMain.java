package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {
    public static void main(String[] args) {


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("PoemTitle", ((toBeDecorated) -> "ABC" + toBeDecorated + "ABC"));
        poemBeautifier.beautify("PoemTitle", ((toBeDecorated) -> toBeDecorated.toUpperCase()));
        poemBeautifier.beautify("PoemTitle", ((toBeDecorated) -> "***" + toBeDecorated.toLowerCase() + "***"));
        poemBeautifier.beautify("PoemTitle", ((toBeDecorated) -> "&&" + toBeDecorated.replace('T', 't')));

    }
}
