package com.arrayIntroduction;

//n=4
import java.util.*;

public class Test{
    static int value(int num){
        String s=Integer.toString(num);
        for(int i=1;i<num;i++){
            if(num%i==1 && s.contains(Integer.toString(num-i)) ) {
                s+=Integer.toString(num-i);
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        int num=4;
        value(num);
    }
}