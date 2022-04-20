package com.StringAndStringBuilder;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {

//        Both a and be are pointing to the same object
        String a="kunal";
        String b="kunal";
        System.out.println(a==b);

//        Both name1 and name2 are pointing to the different object because of new keyword
        String name1=new String("Kunal");
        String name2=new String("Kunal");
        System.out.println(name1==name2);

//        equals method only focus in values it do not care the objects
        System.out.println(a.equals(b));
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
        System.out.println(new int[]{1,2,3,4});  //output is [I@e9e54c2
        System.out.println(Arrays.toString(new int[]{1,2,3,4})); //[1, 2, 3, 4]  ---> this is pretty printing
    }
}
