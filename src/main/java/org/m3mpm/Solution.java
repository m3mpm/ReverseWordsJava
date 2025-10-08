package org.m3mpm;

public class Solution {

    private static final String WHITESPACE = " ";

    public Solution() {}

    public String reverseWords1(String s) {

        if (s == null || s.length() == 0) {
            return "";
        }

        String[] words = s.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for(String word : words) {
            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length()-1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            reversedString.append(reversedWord).append(WHITESPACE);
        }

        return reversedString.reverse().toString();

    }

}
