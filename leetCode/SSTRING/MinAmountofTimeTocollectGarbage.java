package com.leetCode.SSTRING;

public class MinAmountofTimeTocollectGarbage {
    static int func(String[] garbage,int[] travel){
        System.out.println(ownfun(garbage,travel,'P'));
        System.out.println(ownfun(garbage,travel,'G'));
        System.out.println(ownfun(garbage,travel,'M'));
        return ownfun(garbage,travel,'P')+ownfun(garbage,travel,'G')+ownfun(garbage,travel,'M');
    }
    static int ownfun(String[] garbage,int[] travel,char g){
        int sum=0;
        for(int i=1;i<garbage.length;i++){
            if(garbage[i].length()==1){
                if(garbage[i]==g+"")
                    sum+=travel[i-1];
            }
            else {
                for(int j=0;j<garbage[i].length();j++){
                    if(garbage[i].charAt(j)==g)
                        sum+=travel[i-1];
                }
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
