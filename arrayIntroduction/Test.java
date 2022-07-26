package com.arrayIntroduction;


public class Test {
    public static void main(String[] args) {
        int a[]={10,20,30,40, 10, 5, 2, 1 };
        int target=20;
        System.out.println(orderAgnostic(a,target));;
    }
    static int orderAgnostic(int[] a,int target){
        int peak=findPeak(a);
//        first half of an array
        int firstTry=orderAgnostic(a,target,0,peak);
        if(firstTry!=-1)
            return firstTry;
        return orderAgnostic(a,target,peak+1,a.length-1);
    }
    static int findPeak(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(a[mid]>a[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
    static int orderAgnostic(int a[],int target,int start,int end){
        boolean asc=a[start]<a[end];
        while (start<=end){
            int mid=start+(end-start)/2;
//            if(a[mid]==target)
//                return mid;
            if(asc){
                if(target>a[mid])
                    start=mid+1;
                else if(target<a[mid])
                    end=mid-1;
                else
                    return mid;
            }
            else {
                if(target>a[mid])
                    end=mid-1;
                else if(target<a[mid])
                    start=mid+1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
