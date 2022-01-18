package com.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && j != i)
                    count++;
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        How_Many_Numbers_Are_Smaller_Than_the_Current_Number s = new How_Many_Numbers_Are_Smaller_Than_the_Current_Number();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        if (nums.length < 2 || nums.length > 500)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 0 || nums[i] > 100)
                System.exit(0);
        }
        int[] res = s.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
}
