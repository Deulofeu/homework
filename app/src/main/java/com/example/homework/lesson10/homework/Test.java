package com.example.homework.lesson10.homework;

import java.util.Scanner;

public class Test {
    private static final String REGEX_DOCUMENT = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static void main(String[] args) {
        String document = inputDocument();
        documentMethods(document);
    }

    public static String inputDocument() {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        String document = null;
        while (!flag) {
            System.out.println("Введите номер документа в формате  xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
            document = in.nextLine();
            flag = document.matches(REGEX_DOCUMENT);
        }
        return document;
    }

    public static void documentMethods(String document) {
        Document.printFirstTwoBlocksNumbers(document);
        Document.printReplaceDocument(document);
        Document.printLetters(document);
        Document.checkSubsequenceAbc(document);
        Document.checkEndSubsequence1a2b(document);
    }
}
