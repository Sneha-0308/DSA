package com.arrayIntroduction;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
      int a[]={4,5,1,2,3};
        System.out.println(Arrays.toString(sort(a)));
    }
    static int[] sort(int a[]){
        boolean swapped;
        for(int i=0;i<a.length;i++){
            swapped=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        return a;
    }
}
