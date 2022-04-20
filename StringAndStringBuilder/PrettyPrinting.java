package com.StringAndStringBuilder;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a=423.12554f;  //this is float
//                float a=423.12554;  without suffix f the number will be represented as double and will get error
//        as Required type:float
//           Provided     :Provided:
//        this will format the number as well round of the number
        System.out.printf("Formatted number is %.2f",a);  //OUTPUT --> Formatted number is 423.13
        System.out.println();

        System.out.println(Math.PI);  //3.141592653589793
        System.out.printf("Pei values is %.3f",Math.PI);  //Pei values is 3.142

//        That's why % is called as placeholder
        System.out.printf("Hello my name is %s and I'm %s","sneha","cool");
        System.out.println();
        System.out.printf("Hexadecimal value %x",10);  // out put is a because the value od decimal 10 in hexadecimal is a

    }
}
