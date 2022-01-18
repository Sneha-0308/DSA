package com.leetCode;

import java.util.Scanner;

public class LeetCode1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*22.Subtract the Product and Sum of Digits of an Integer(LeetCode)*/
//        System.out.println("enter number");
//        int n=s.nextInt();
//        int mul=1;
//        int add=0;
//        int count=0;
//        while(n>0)
//        {
//            int rem=n%10;
//            mul*=rem;
//            add+=rem;
//            count++;
//            n=n/10;
//        }
//        System.out.println(mul);
//        System.out.println(add);
//        System.out.println(mul-add);
//
        /*Given a signed 32-bit integer x, return x with its digits reversed.
        If reversing x causes the value to go outside the signed 32-bit integer
         range [-231, 231 - 1], then return 0*/
        System.out.println("enter number:");
        int n = s.nextInt();
        int count = 0;
        if (n < 0)
            System.out.print("-");
        n = n + (2 * -(n));
        while (n > 0) {
            int rem = (n % 10);
            System.out.print(rem);
            n /= 10;
            count++;
        }

    }
}
