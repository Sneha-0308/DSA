package com.leetCode.SSTRING;

public class MinAmountofTimeTocollectGarbage {
    static int func(String[] garbage,int[] travel){
        int a=ownfun(garbage,travel,"G");
        int b=ownfun(garbage,travel,"M");
        int c=ownfun(garbage,travel,"P");
        int d=0;
        for(int i=0;i<garbage.length;i++)
            d+=garbage[i].length();
        return a+b+c+d;
    }
    static int ownfun(String[] garbage,int[] travel,String g){
        int sum=0;
        for(int i=garbage.length-1;i>=0;i--){
            if(garbage[i].contains(g)){
                for(int j=i-1;j>=0;j--){
                    sum+=travel[j];
                }
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        System.out.println(func(garbage,travel));
    }
}
