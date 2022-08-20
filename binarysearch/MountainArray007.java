package com.binarysearch;

public class MountainArray007 {
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,4,3,2,1};
        System.out.println(peakIndexInMountainArray(a));
    }
    static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end=arr.length-1;
        while (start<end){
            int mid = start +(end-start)/2;
            if (arr[mid] < arr[mid+1]) //Ascending
                start=mid+1;
            else
                end=mid;
        }
        return start; //or return end;
    }
}
