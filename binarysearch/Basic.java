package com.binarysearch;

public class Basic {
    public static void main(String[] args) {
//        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};  //ASCENDING ORDER
        int arr[]={15,12,7,5,2,0};  //DESCENDING ORDER
        int target = 0;
        int ans=search(arr,target);
        System.out.println(ans);
    }

    //ASCENDING ORDER

//    static int search(int[] arr,int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(target<arr[mid])
//                end = mid-1;
//            else if(target>arr[mid])
//                start=mid+1;
//            else //ONLY THIS RETURN STATEMENT IS PRINTED EVERYTIME IF THE TARGET ELEMENT IS PRESENT IN THE GIVEN ARRAY.
//                return mid;//ANSWER FOUND
//        }
//        return -1;//IF THE TARGET ELEMENT IS NOT PRESENT IN THE ARRAY -1 VALUE WE GET
//    }

//    DESCENDING ORDER

    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start+(end-start)/2;
            if(target>arr[mid])
                end=mid-1;
            else if(target<arr[mid])
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
