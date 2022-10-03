package com.arrayIntroduction;

public class Sam {
    static int func(int num){
        int temp=num;
        int res=0;
        while(temp!=0){
            int r=temp%10;
            res=res*10+r;
            temp/=10;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(func(1234));
    }
}
