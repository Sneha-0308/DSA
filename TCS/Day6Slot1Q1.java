package com.TCS;

public class Day6Slot1Q1 {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int temp,rem;
        int limit=(int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            String set="";
            temp=i;
            for(int j=arr.length-1;j>=0;j--){
                rem=temp%2;
                temp/=2;
                if(rem==0)
                    set+="";
                else
                    set=arr[j]+set;
            }
            System.out.println(set);
        }
    }
}
