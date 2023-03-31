package com.leo.practice.practice.leetcode;

public class RomaToInt {
    public int romanToInt(String input) {
        int num = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'I') {
                num += 1;
            }
            if (input.charAt(i) == 'V') {
                num += 5;
                num = leftNumExists(input, num, i, 'I', 2);
            }
            if (input.charAt(i) == 'X') {
                num += 10;
                num = leftNumExists(input, num, i, 'I', 2);
            }
            if (input.charAt(i) == 'L') {
                num += 50;
                num = leftNumExists(input, num, i, 'X', 20);
            }
            if (input.charAt(i) == 'C') {
                num += 100;
                num = leftNumExists(input, num, i, 'X', 20);
            }
            if (input.charAt(i) == 'D') {
                num += 500;
                num = leftNumExists(input, num, i, 'C', 200);
            }
            if (input.charAt(i) == 'M') {
                num += 1000;
                num = leftNumExists(input, num, i, 'C', 200);
            }
        }
        return num;
    }

    private static int leftNumExists(String input, int num, int i, char c, int numChange) {
        if (i-1 < 0) {
            return num;
        }
        if (input.charAt(i - 1) == c) {
            num -= numChange;
        }
        return num;
    }
}
