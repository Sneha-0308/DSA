package com.arrayIntroduction;

import java.util.LinkedList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        String s="listen";
        String t="silent";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j))
                    t=t.substring(0,j)+t.substring(j+1);
            }
        }
        System.out.println(t);
    }
}