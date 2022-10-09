package com.leetCode.Arrays;

import java.util.Arrays;

public class NextPermutation {
    static void fun(int[] nums){
        int n=nums.length-1;//last element pointer
//        first find the infection point
        int infpt=0;
        for(int i=n;i>0;i--){
            if(nums[i-1]<nums[i]){
                infpt=i;
                break;}
        }
        if(infpt==0)
            Arrays.sort(nums);
        //find the next smallest element of infected element and then swap those two after that from next element you have sorted it in ascending order
        else
        {
            int min=Integer.MAX_VALUE;
            int swap=nums[infpt-1];
            for(int j=infpt;j<=n;j++){
                //used to swap the infected number and one which next to that number
                if(nums[j]-swap>0 && nums[j]-swap<min ){
                    int temp=nums[j];
                    nums[j]=nums[infpt-1];
                    nums[infpt-1]=temp;
                }
            }
//            sort array which are present after the infected element
            Arrays.sort(nums,infpt,n+1); //toIndex is excluded
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr={7,2,5,3,1};
        fun(arr);
    }
}
