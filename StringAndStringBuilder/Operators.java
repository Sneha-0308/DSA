package com.StringAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+1);
        System.out.println('a'+3); //output is 100
        System.out.println((char)('a'+3)); //97+3 = 100 -->that is ascii value of d
        String ans = new Integer(56) + "" + new ArrayList<>();
//         String ans = new Integer(56) + new ArrayList<>();  --> this gives the ERROR
//        System.out.println(ans);
        System.out.println(ans);
    }
}
