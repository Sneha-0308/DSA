package com.leetCode.Arrays;

import java.util.Arrays;

public class SingleNumber{
    static int findSingle(int[] nums){
//        base case
        Arrays.sort(nums);
        int count;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i+=2){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
            if(count==0)
                return nums[i];

        }
        return nums[nums.length-1];
    }
    public static void main(String[] args){
        int[] arr={-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        System.out.println(findSingle(arr));
    }
}
//[-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354]