package com.testing.mutation;

import java.util.stream.IntStream;

public class DemoService {

    public boolean isPositive(int number) {
        boolean result = false;
        if (number > 0) {
            result = true;
        }
        return result;
    }

    public static boolean isPalindrome(String originalString) {
        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
    }
}