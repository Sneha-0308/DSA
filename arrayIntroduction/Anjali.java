package com.arrayIntroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Anjali {
//    static int fun(int num,int target){
//        int count=0,rem=0;
//        while (num!=0){
//            rem=num%10;
//            if(rem==target)
//                count++;
//            num/=10;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fun(572378233,3));
//    }

    static int[] func(int[] arr){
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                list1.add(arr[i]);
            else
                list2.add(arr[i]);
        }
        list1.addAll(list2);
        for(int i=0;i<arr.length;i++){
            res[i]=list1.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={24,13,68,79,46,77};
        System.out.println(Arrays.toString(func(arr)));
    }
}
