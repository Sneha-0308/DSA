package com.leetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int majority(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int var=0,result=0,max=0;
        for (int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else {
                var=map.get(nums[i]);
                var+=1;
                map.replace(nums[i], map.get(nums[i]),var);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                result=entry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
/*Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */