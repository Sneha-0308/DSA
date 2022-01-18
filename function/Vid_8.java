package com.function;

import java.util.Arrays;
import java.util.Scanner;

public class Vid_8 {
//    public static void main(String[] args) {
//        int result=sum(10,20);
//        System.out.println(result);
//    }
//    static int sum(int a,int b)
//    {
//        int sum=a+b;
//        return sum;
//    }

//    public static void main(String[] args) {
//        String message=greeting("Sneha");
//        System.out.println(message);
//    }
//    static String greeting(String name)
//    {
//        String sentence="Hey! "+name;
//        return sentence;
//    }

//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter name");
//        String name=s.next();
//        String message=greeting(name);
//        System.out.println(message);
//    }
//    static String greeting(String name){
//        String sentence ="Hey! "+name;
//        return sentence;

//                                      /*Block scoping */
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int num=12;
//        {
//            num=10;//1-> Anything that is initialised outside the bloch you can use inside the block it will be available
//                    inside the block and you can change or modify or update inside block so original value wil be
//                   updated because it will use same reference variable.
//          int num=1;  // 3-> Anything that is initialised outside the block cannot be reinitialised inside the block
//            int a=10;
//        }
//        System.out.println(a);//2-> Anything initialise inside the block cannot be used outside
//         int a=1000; //4-> Anything that is initialised inside the block can be reinitialised outside block

    /*Shadowing*/
//    static int x=90;// this will be shadowed at line 57
//    public static void main(String[] args) {
//        System.out.println(x); //output 90;
//        int x;// the class variable at line 52 is shadowed by this
////        System.out.println(x);  //scope will begin when value is initialised
//        x=40;
//        System.out.println(x);//Output 40
//        fun();
//    }
//static void fun()
//{
//    System.out.println(x);
//    }
    /*Variable length argument*/
//    public static void main(String[] args)
//    {
//        fun();    // it will provide empty array
//        fun(1,2,45,87,9,5,7,5,32);   //it also takes n number of elements
//        fun1("Sneha","Mana", 1,23,4,7);
//    }
//    static void fun(int ...v)       // Variable length argument
//    {
//        System.out.println(Arrays.toString(v));
//    }
//    static void fun1(String a,String b,int ...c)
//    {
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(Arrays.toString(c));
//    }

    /*Method overloading */
//    public static void main(String[] args) {
//          // fun(1);
//           fun("Sneha");
//    }
//    static void fun(int a)
//    {
//        System.out.println(a);
//    }
//    static void fun(String b)
//    {
//        System.out.println(b);
//    }

    /*Whether number is prime or not*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter number");
//        int n=s.nextInt();
//        System.out.println(isPrime(n));
//    }
//    static boolean isPrime(int n)
//    {
//     if(n<=1)
//         return false;
//     int c=2;
//     while(c*c<=n)
//     {
//         if(n%c==0)
//             return false;
//         c++;
//     }
//     return c*c>n;
//    }

    /*Check Armstrong Number*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter number");
//        int n=s.nextInt();
//        System.out.println(isArmstrong(n));
//    }
//    static boolean isArmstrong(int n)
//    {   int sum=0;
//        int original=n;
//        while(n>0)
//        {
//            int rem=n%10;
//            n/=10;
//            sum =sum+rem*rem*rem;
//        }
//        return sum == original;
//    }

    /*Print all 3 digit armstrong number */
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }

}