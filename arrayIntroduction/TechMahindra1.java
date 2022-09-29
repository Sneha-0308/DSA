package com.arrayIntroduction;
//11 22 45

public class TechMahindra1 {
    static void sales(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int rem=0,sum=0;
            while (temp!=0){
                rem=temp%10;
                sum+=rem;
                temp/=10;
            }
            System.out.print(sum+" ");
        }

    }
    public static void main(String[] args){
        int[] arr={11,22,45};
        sales(arr,3);
    }
}