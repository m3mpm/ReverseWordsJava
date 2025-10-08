package org.m3mpm;


import java.util.concurrent.TimeUnit;

public class Main {
    private static final String TEXT = "I love you so much!";

    public static void main(String[] args) {


        Solution solution = new Solution();


        long startTime1 = System.nanoTime();
        String newString = solution.reverseWords1(TEXT);
        long endTime1 = System.nanoTime();
        displayExecutionTime(endTime1 - startTime1);
        System.out.println(newString);

    }

    private static void displayExecutionTime(long time) {
        System.out.println("Время выполнения: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}