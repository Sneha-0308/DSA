package com.arrayIntroduction;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//
//        list.add(123);//list.add(input the value: )
//        list.add(143);
//        list.add(5656);
//        list.add(345);
//        list.add(4522);
//        list.add(2524);
//        list.add(24896);
//        list.add(25);
//        list.add(245);
//        System.out.println(list); //will print list not list(index)

//        list.set(0,12);    //list.set(index: ,value which you want to change: )
//        System.out.println(list);

//        System.out.println(list.contains(3));//list.contains(value is present or not: )

//        list.remove(1);//list.remove(index: )
//        System.out.println(list);

//        System.out.println(list.get(1));//list.get(index: ) for getting the value

        //user input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//we won't write like list(i) instead we use list.get method
        }
//        System.out.println(list);//we can also use like this instead of using for loop ang list.get() method
    }
}
