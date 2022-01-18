package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};  //ASCENDING ORDER
        int arr[]={15,12,7,5,2,0};  //DESCENDING ORDER
        int target= 0;
        int ans =orderAgnostic(arr,target);
        System.out.println(ans);
    }
    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (isAsc) {//FOR ASCENDING ORDER
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {//FOR DESCENDING ORDER
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

        }
        return -1;//IF THE TARGET ELEMENT IS NOT PRESENT IN THE ARRAY -1 VALUE WE GET
    }
}
