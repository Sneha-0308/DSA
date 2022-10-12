package com.leetCode.Arrays;

import java.util.Arrays;

public class MoveZeroes {
    static void fun(int[] nums){
        int j=0,i=0;
        while (i<nums.length){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums={0};
        fun(nums);
    }
}
