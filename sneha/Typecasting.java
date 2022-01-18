package com.sneha;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*we can give input that input must be smaller than mention datatype at the left .
    if we give input which is greater than mention datatype in left
    side then it will through exceptions
     */
        int num1 = in.nextInt();
        System.out.println(num1);
        float num2 = in.nextFloat();
        System.out.println(num2);


        //Narrowing datatype
        int num = (int) (in.nextInt());
        System.out.println(num);


        //Automatic type promotion
        byte b = 50;
        b = (byte) (b * 2);
        System.out.println(b);

        //Unicode
        System.out.println("ನಮಸ್ಕಾರ");

        //while loop
        int count = 1;         //Initialization
        while (count != 6) {   //Condition
            System.out.println(count);
            count++;
        }        //Increment

        //for loop
        for (int count1 = 1; count1 <= 5; count1++)
            System.out.println(count1);
    }
}
