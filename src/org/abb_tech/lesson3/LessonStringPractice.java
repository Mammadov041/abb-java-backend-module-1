package org.abb_tech.lesson3;

import java.util.StringJoiner;

public class LessonStringPractice {
    static void main(String[] args) {
        String courseName = "ABB tech";
        String courseName3 = String.valueOf("ABB tech");
        String courseName4 = "ABB tech";
        String courseName7 = courseName4;
        courseName7 = "ABB tech 2";

        String courseName2 = new String("ABB tech");
        String courseName5 = new String("ABB tech");
        String courseName6 = new String("ABB tech");

        StringBuffer bufferedString = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();


        bufferedString.append("abbtech");
        bufferedString.append("tech");

        stringBuilder.append("abbtech");
        stringBuilder.append("tech");

        StringJoiner joiner = new StringJoiner(" ", "prefix", "suffix");
        joiner.add("Abb");
        joiner.add("tech");


        String testString = "Dummy String2";
        String testString2 = "Dummy String2";
        String testString3 = new String("dummy String2");


        String formatted = String.format("I learned %s in %d", "Java Java", 2013);

        String emptyString = "";
        String blankString = "     ";
        String nullString = null;

        System.out.println(formatted.replace("Java", "C++"));
        System.out.println(formatted.replaceAll("^[a-zA-Z0-9$@$!%*?&#^-_. +]+$", "QWEQWEWQ"));
        String splitExample = "abbtech,tech,academy,xysz";
        String[] splitArray = splitExample.split(",");

    }
}
