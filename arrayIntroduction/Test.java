package com.arrayIntroduction;


public class Test {
    public static void main(String[] args) {
        int a[]={1,2,3,5,7,9,6,3,2};
        System.out.println(result(a,7));
    }
    static int peak(int a[]){
        int start=0;
        int end=a.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(a[mid]>a[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
    static int result(int a[],int target){
        int val=peak(a);
        if(a[val]>target) {
            int start=0;
            int end=val;
            return ascendingSearch(a, target,start,end);
        }
        else {
            int start=val;
            int end=a.length-1;
            return descendingSearch(a,target,start,end);
        }

    }
    static int ascendingSearch(int a[],int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]>target)
                end=mid-1;
            else if(a[mid]<target)
                start=mid+1;
            else return mid;
        }
        return -1;
    }
    static int descendingSearch(int a[],int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]>target)
                start=mid+1;
            else if(a[mid]<target)
                end=mid-1;
            else return mid;
        }
        return -1;
    }
}
