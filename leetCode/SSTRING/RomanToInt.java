package com.leetCode.SSTRING;

public class RomanToInt {
//    STringsProblem
public static void main(String[] args) {
    String s="LVIII";
    System.out.println(romanToInt(s));
}
static int romanToInt(String s) {
    int now=0,last=0,res=0;
    for(int i=s.length()-1;i>=0;i--){
        switch(s.charAt(i)){
            case 'I':now=1;break;
            case 'V':now=5;break;
            case 'X':now=10;break;
            case 'L':now=50;break;
            case 'C':now=100;break;
            case 'D':now=500;break;
            case 'M':now=1000;break;
        }
        if(now>=last)
            res+=now;
        else
            res-=now;
        last=now;
    }
    return res;
}
}
