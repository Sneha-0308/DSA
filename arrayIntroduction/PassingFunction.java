package com.arrayIntroduction;

import java.util.Arrays;
import java.util.Scanner;

public class PassingFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 0;
    }
}