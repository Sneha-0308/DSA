package com.leetCode.Arrays;

import java.util.Arrays;

public class Remove_element {
    static int remove(int[] nums,int val){
       int ans=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
               nums[ans]=nums[i];
               ans++;
           }
       }
       return ans;
    }
    public static void main(String[] args){
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(remove(nums,val));
    }
}
