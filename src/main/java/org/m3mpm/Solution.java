package org.m3mpm;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {

    private static final String WHITESPACE = " ";
    private static final Pattern PATTERN = Pattern.compile(" +");

    public Solution() {}

    public String reverseWords1(String str) {

        if (str == null || str.length() == 0) {
            return "";
        }

        String[] words = str.split(WHITESPACE);
        StringBuilder sb = new StringBuilder();

        for(String word : words) {
            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length()-1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            sb.append(reversedWord).append(WHITESPACE);
        }

        return sb.toString();

    }

    public String reverseWords2(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        return PATTERN.splitAsStream(str).
                map(word -> new StringBuilder(word).reverse()).
                collect(Collectors.joining(WHITESPACE));
    }

}
