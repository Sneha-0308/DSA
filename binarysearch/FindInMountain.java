package com.binarysearch;

public class FindInMountain {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,3,1};
        System.out.println(search(a,3));
    }
    static int peak(int[] a){
        int start = 0;
        int end=a.length-1;
        int mid=start+(end-start)/2;
        while (start<end){
            if(a[mid]<a[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        return start;
    }
    static int search(int a[],int target){
        int ans=0;
       int val= peak(a);
       if(a[val]>target){
//           ascending order search
           int start=0;
           int end=val;
           int mid=start+(end-start)/2;
           while (start<=end){
               if(target<a[mid])
                   end=mid-1;
               else if(target>a[mid])
                   start=mid+1;
               else
                   ans=mid;
           }
       }
       else if(target>a[val]){
//           descending order search
           int start=val;
           int end=a.length-1;
           int mid=start+(end-start)/2;
           while (start<=end){
               if(target<a[mid])
                   start=mid+1;
               else if(target>a[mid])
                   end=mid-1;
               else ans=mid;
           }
       }
       else
           ans=val;
       return ans;
    }
}
