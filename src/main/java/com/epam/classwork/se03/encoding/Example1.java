package com.epam.classwork.se03.encoding;

public class Example1 {

    public static void main(String[] args) {
        String str = "\uD86A\uDFCE";
        char sym = '☭';



        System.out.println(str.length());

    }


    // 0 - 255 <- 1 байт
    // 0 - 127
    // 0.......
    // 110xxxxx 10xxxxxx
}
