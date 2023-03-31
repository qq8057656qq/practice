package com.leo.practice.practice.leetcode;


public class Reverse {

    public static void main(String[] args) {
        System.out.println(new Reverse().isPalindrome2(121));
//        System.out.println(new Reverse().isPalindrome(-121));
//        System.out.println(new Reverse().isPalindrome(10));
    }
    public boolean isPalindrome2(int x) {
        if(x < 0) return false; // 负数不是回文数
        int cur = x; // 指向当前判断的最高位
        int div = 1; // 用于计算当前数的最高位位权
        while(cur / 10 > 0) {
            cur /= 10;
            div *= 10; // 每次除以十，位权乘以十
        }
        while(x > 0) {
            int left = x / div; // 最高位
            int right = x % 10; // 最低位
            if(left != right) return false;
            x = (x % div) / 10; // 把最高位和最低位去掉
            div /= 100; // 把新的数的位权缩小100倍
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int origin = x;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reverse = reverse * 10 + pop;
        }
        return origin == reverse;
    }
}
