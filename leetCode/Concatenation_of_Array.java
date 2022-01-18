package com.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_Array {
    public int[] getConcatenaton(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Concatenation_of_Array s = new Concatenation_of_Array();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1 || n > 1000)
            System.exit(0);
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 1 || nums[i] > 1000)
                System.exit(0);
        }
        if (n == nums.length)
            System.exit(0);
        int last[] = s.getConcatenaton(nums);
        System.out.println(Arrays.toString(last));
    }
}
