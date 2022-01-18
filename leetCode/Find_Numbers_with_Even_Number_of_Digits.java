package com.leetCode;

import java.util.Scanner;

public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                int rem = nums[i] % 10;
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                even = even + 1;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        Find_Numbers_with_Even_Number_of_Digits s = new Find_Numbers_with_Even_Number_of_Digits();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        if (nums.length < 1 || nums.length > 500)
            System.exit(0);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] < 1 || nums[i] > Math.pow(10, 5))
                System.exit(0);
        }
        System.out.println(s.findNumbers(nums));
    }
}
