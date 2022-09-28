package com.leetCode.Arrays;

public class ThreeSumClosest {
    static int sum(int[] nums,int target){
        int result=Integer.MIN_VALUE;
        int sum=0,dif=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i;j<nums.length-2;j++){
                sum=nums[i]+nums[j++]+nums[j++];
                dif=target-sum;
                if(dif<0 && result<dif)
                    result=dif;
                else if (dif>0 && result>dif)
                    result=dif;
            }
        }

    }
}
