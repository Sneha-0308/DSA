package com.binarysearch;

//TODO AMAZON
public class InfinityArray006 {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30,50};
        int target = 15;
        int ans = ans(arr,target);
        System.out.println(ans);
    }
    static int ans(int[] arr,int target){
        //FIRST WILL TAKE ARRAY SIZE AS 2 IF THE TARGET ELEMENT IS PRESENT IN THAT RANGE WILL TAKE THE VALUE OF START AND END SAME OR ELSE WILL
//        INCREASE THE SIZE OF AN ARRAY BY 2 THEN DO THE SAME THING
        int start = 0;
        int end =1;
        //CONDITION FOR THE ELEMENT THAT LIES BETWEEN GIVEN RANGE THAT IS IF TARGET IS GREATER THAN ARR[END] THEN WE CAN SAY THAT TARGET ELEMENT
        // IS NOT PRESENT IN GIVEN RANGE THE DOUBLE THE SIZE TO FIND THE START AND END THEN APPLY BINARY SEARCH
        while(target>arr[end])
        {
            int newstart = end+1; //HERE IM NOT TAKING start AS VARIABLE BECAUSE I NEED OLD START TO CALCULATE THE END SO
            end = end+(end-start+1)*2; //PREVIOUS END +SIZEOFBOX*2
            start = newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
