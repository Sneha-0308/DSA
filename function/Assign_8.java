package com.function;

import java.util.Scanner;

public class Assign_8 {
//    public static void main(String[] args) {
//
//1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter 3 number ");
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int c=s.nextInt();
//        maximum(a,b,c);
//        minimum(a,b,c);
//    }
//    static void maximum(int a,int b,int c)
//    {
//        if(a>b)
//        {
//            if(a>c)
//                System.out.println(a+" is greater");
//            else
//                System.out.println(c+" is greater");
//        }
//        else if (c>b)
//            System.out.println(c+" is greater");
//        else
//            System.out.println(b+" is greater");
//    }
//    static void minimum(int a,int b,int c)
//    {
//        if(a<b)
//        {
//            if(a<c)
//                System.out.println(a+" is smaller");
//            else
//                System.out.println(c+" is Smaller");
//        }
//        else if (c<b)
//            System.out.println(c+" is smaller");
//        else
//            System.out.println(b+" is smaller");
//    }

    //2.Define a program to find out whether a given number is even or odd.
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter number");
//        int n=s.nextInt();
//        System.out.println("even is "+even(n) );
//        System.out.println("odd is "+odd(n));
//    }
//    static boolean even(int n)
//    {
//        return n % 2 == 0;
//    }
//    static boolean odd(int n)
//    {
//        return !(n%2==0);
//    }

    /*3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter age of person");
//        int age=s.nextInt();
//        System.out.println( voting(age));
//    }
//    static boolean voting(int age)
//    {
//       return age>=18;
//    }

    /*4.Write a program to print the sum of two numbers entered by user by defining your own method.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter two number");
//        int a=s.nextInt();
//        int b=s.nextInt();
//        System.out.println( sum(a,b));
//    }
//    static int sum(int a,int b)
//    {
//       return a+b;
//    }

    /*5.Define a method that returns the product of two numbers entered by user.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        int b=s.nextInt();
//        System.out.println(   product(a,b));
//    }
//    static int product(int a,int b)
//    {
//        return a*b;
//    }

    /*6.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter radius");
//        float r=s.nextFloat();
//        System.out.println(circumference(r));
//        System.out.println( area(r));
//    }
//    static float circumference(float r)
//    {
//        return 2*3.14f*r;
//    }
//    static float area(float r)
//    {
//        return 3.14f*r*r;
//    }

    /*7.Define a method to find out if number is prime or not*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        System.out.println(isprime(n));
//    }
//    static boolean isprime(int n)
//    {
//        if(n<=1)
//            return false;
//        int c=2;
//        while(c*c<=n)
//        {
//            if(n%c==0)
//                return false;
//            c++;
//        }
//        return c*c>n;
//    }
    /*8.Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
     Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int marks=s.nextInt();
//        System.out.println(grade(marks));
//    }
//    static String grade(int marks)
//    {
//        if(91<=marks && marks<=100)
//            return "AA";
//        if(marks>=81 && marks<=90)
//            return "AB";
//        if(marks>=71 && marks<=80)
//            return "BB";
//        if (marks>=61 && marks<=70)
//            return "BC";
//        if(marks>=51 && marks <=60)
//            return "CD";
//        if(marks>=41 && marks<=50)
//            return "DD";
//        return "Fail";
//    }

    /*9.Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
    E.g.- 4! = 1 * 2 * 3 * 4 = 24 3! = 3 * 2 * 1 = 6 2! = 2 * 1 = 2 Also, 1! = 1 0! = 1*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        System.out.println(fact(n));
//    }
//    static int fact(int n)
//    {
//        int ans=1;
//        if(n==0 && n==1)
//            return 1;
//        for (int i = 1; i <=n ; i++) {
//            ans*=i;
//        }
//        return ans;
//    }

    /*10.Write a function to find if a number if palindrome or not. Take number as parameter.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        System.out.println(palindrome(n));
//    }
//    static boolean palindrome(int n)
//    {
//        int sum=0;
//        int original=n;
//        while(n>0)
//        {
//            int rem=n%10;
//            sum=(sum*10)+rem;
//            n/=10;
//        }
//        return original==sum;
//    }

    /*12.Write a function to check if a given triplet is a Pythagorean triplet or not.
    (A Pythagorean triplet is when the sum of the square of two number is equal to the square of the third number).*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int c=s.nextInt();
//        System.out.println(pythagorean(a,b,c));
//    }
// static boolean pythagorean(int a,int b,int c)
// {
//     return (a*a+b*b)==c*c;
// }

    /*13.Write a function that returns all prime numbers between two given numbers.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        for (int i = 1; i <=n; i++) {
//            if(primelist(i))
//                System.out.println(i);
//        }
//
//    }
//    static boolean primelist(int n)
//    {
//        if(n<=1)
//            return false;
//        int c=2;
//        while(c*c<=n)
//        {
//            if(n%c==0)
//                return false;
//            c++;
//        }
//        return c*c>n;
//    }

    /*14.Write a function that returns the sum of first n natural numbers.*/
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        System.out.println(  sumofn(n));
//    }
//    static int sumofn(int n)
//    {
//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum+=i;
//        }
//        return sum;
//    }

//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        System.out.println(reverse(n));
//    }
//    static int reverse(int n)
//    {  int ans=0;
//        while(n!=0)
//        {
//            int rem=n%10;
//            ans=ans*10+rem;
//            n/=10;
//        }
//        return ans;
//    }
}
