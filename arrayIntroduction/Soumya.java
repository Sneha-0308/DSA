package com.arrayIntroduction;

public class Soumya {
    static boolean fun(int num){
        boolean flag=false;
        for(int i=2;i<=num/2;++i){
            if(num%i==0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    static int result(int num){
        int sum=0;
        while (num!=0){
            int rem=num%10;
            if(!fun(rem))
                sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(result(34365655  ));
    }
}
