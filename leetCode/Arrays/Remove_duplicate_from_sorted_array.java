package com.leetCode.Arrays;


public class Remove_duplicate_from_sorted_array {
    static int removeDuplicate(int[] nums){
        int n=nums.length;
//        consider two points
        int a=0,b=1;
        while (b<n){
//            pointer a is present at the end of sorted non-duplicate element and b pointer
//            moves to check if the element is different from the non-duplicate element if
//            they are different you have to increment the a-index and swap the number then
//            increment b to check next non-duplicate element
            if(nums[a]!=nums[b]){
                a++; //we increment pointer-a  before swapping to get the non-duplicate elements
                int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                b++;
            }
//            if the both the pointers are pointing to the same element then just
//            increment b pointer to check the non-duplicate element
            else
                b++;
        }
//        As we know that the pointer-a points to the last non-duplicate element the answer is add +1 to it so we get the total number of non-duplicate element
        return a+1;
    }
    public static void main(String[] args){
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));

    }
}
