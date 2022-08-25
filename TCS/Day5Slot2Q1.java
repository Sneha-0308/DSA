package com.TCS;

import java.util.Scanner;

public class Day5Slot2Q1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        for(int i=0;i<b.length();i++){
            String ans="";
            for(int j=0;j<a.length();j++){
                if(b.charAt(i)!=a.charAt(j))
                    ans+=a.charAt(j);
            }
            a=ans;
        }
        System.out.println(a);
    }
}
/*Question 1-
Jack and Jill  are playing string game. Jack has given Jill two strings A and B.

Jill has to derive a string C from A,by deleting elements from string A, such that string C does not contain any element of string B.

Jill needs help to do this task. She wants a program to do this as she is lazy.

Given strings A and B as input ,give string C as Output.

Example 1:

Input:
tiger     -> input string A
ti          -> input string B
Output:
ger       -> Output string C
Explanation:
After removing “t” and “i” from “tiger”, we are left with “ger”.
So, the answer is “ger”.
Example 2:

Input:
processed     -> input string A
esd                -> input string B
Output:
proc               -> Output string C
Explanation:
After removing “e” “s” and “d” from “processed”, we are left with “proc”.
So, the answer is “proc”.
Example 3:

Input:
talent        -> input string A
tens          -> input string B
Output:
al              -> Output string C
Explanation:
After removing “t” “e” and “n” from “talent”, we are left with “al”.
So, the answer is “al”.*/