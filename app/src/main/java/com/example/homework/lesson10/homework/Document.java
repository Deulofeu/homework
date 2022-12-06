package com.example.homework.lesson10.homework;

public class Document {
    public static void printFirstTwoBlocksNumbers(String document) {
        String[] blocks = document.split("-");
        System.out.println("Два первых блока по 4 цифры:" + blocks[0] + " " + blocks[2]);
    }

    public static void printReplaceDocument(String document) {
        System.out.println("Блоки из трех букв заменены на ***: " + document.replaceAll("[A-z]{3}", "***"));
    }

    public static void printLetters(String document) {
        String ourDocument = document.toUpperCase();
        StringBuilder letters = new StringBuilder();
        String[] blocks = ourDocument.split("-");
        letters = letters.append(blocks[1]).append("/").append(blocks[3]).append("/").append(ourDocument.charAt(19)).append("/").append(ourDocument.charAt(21));
        System.out.println("Letters:" + letters);
    }

    public static void checkSubsequenceAbc(String document) {
        String ourDocument = document.toLowerCase();
        String[] blocks = ourDocument.split("-");
        if (blocks[1].equals("abc") || blocks[3].equals("abc")) {
            System.out.println("Содержит последовательность abc");
        } else {
            System.out.println("Не содержит последовательность abc");
        }
    }

    public static void checkEndSubsequence1a2b(String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            System.out.println("Документ не заканчивается на 1a2b");
        }
    }
}
