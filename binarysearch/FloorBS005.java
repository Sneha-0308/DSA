package com.binarysearch;
//FLOOR OF NUMBER IS THE GREATEST NUMBER THAT IS SMALLER THAN OR EQUAL TO TARGET
public class FloorBS005 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 4;
        int ans=floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target<arr[start])
            return -1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end = mid-1;
            else
                return mid;
        }
        return end;
    }
}
