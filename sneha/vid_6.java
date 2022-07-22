package com.sneha;

import java.util.Scanner;

public class vid_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*FOR LOOP*/

//        for (int i = 1; i <6 ; i++) {
//            System.out.println(i);
//        }

//        int i=1;
//        while(i<=5)
//        {
//            System.out.println(i);
//            i++;
//        }
//
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=5);


        /*Q1.Greatest of three number (there are 3 methods)*/
        //1st method
//        int a=s.nextInt();
//        int b=s.nextInt();
//        int c=s.nextInt();
//        int max=a;
//        if(b>max)
//            max=b;
//        if(c>max)
//            max=c;
//        System.out.println("Maximum value is "+max);

        //2nd method
//        int max=0;
//        if(a>b)
//            max=b;
//        else
//            max=a;
//        if(c>max)
//            max=c;
//        System.out.println("Maximum value is "+max);

        //3rd method
//        int max=Math.max(c,Math.max(a,b));
//        System.out.println("Maximum value is "+max);

        /*TRIME*/

//        String word="Sneha";
//        System.out.println(word.trim().charAt(2));
        /* Q.2 character check*/
//        char ch=s.next().trim().charAt(0);
//        System.out.println(ch);  // If you give string as "Sneha" output of this is S
//        if(ch>='a' && ch<='z')
//            System.out.println("Character is in lower case");
//        else
//            System.out.println("Character is in upper case");

//        String word=s.next();
//        System.out.println(word.trim());

        /*Q3.FIBONACCI*/

//        System.out.println("Enter number:");
//        int n=s.nextInt();
//        int p=0; //previous value
//        int i=1; //current value
//        int count=2;
//        System.out.print(0+" "+1+" ");
//        while(count<=n){
//            int temp=i;
//            i=i+p;
//            p=temp;
//            System.out.print(i+" ");
//            count++;
//        }

        /* Q4.Counting occurrences*/

//        int count=0;
//        System.out.println("Enter number");
//        int num=s.nextInt();
//        System.out.println("Select a number");
//        int n=s.nextInt();
//        while(num>0)
//        {
//            int rem=num%10; //Provides last digit
//            if(rem==n)      //last digit is equal to that selected number then increment count by 1
//                count++;
//            num=num/10;    //remove the last digit
//        }
//        System.out.println(count);

        /*Q5.Reverse002 number*/
//        int n=15456;
//        int ans=0;
//        while(n>0)
//        {
//            int rem=n%10;
//            //System.out.print(rem);
//            ans=ans*10+rem;
//            n=n/10;
//        }
//        System.out.println(ans);

        /*Q6.Calculator*/
        System.out.println("enter two number");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        for (; ; ) {
            System.out.println("enter operator:");
            int op = s.next().trim().charAt(0); //we do not have nextChar method so we use next().trim().charAt(index_number)
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+')
                    c = a + b;
                if (op == '-')
                    c = a - b;
                if (op == '*')
                    c = a * b;
                if (op == '/') {
                    if (b == 0)
                        System.out.println("undefined");
                    else
                        c = a / b;
                }
                if (op == '%')
                    c = a % b;
            } else if (op == 'x' || op == 'X')
                break;
            else
                System.out.println("Invalid choice");
            System.out.println("answer = " + c);// if you didn't initialize int c=0; it will throw exception to initialization
        }
    }
}
