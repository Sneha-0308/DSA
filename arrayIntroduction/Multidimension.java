package com.arrayIntroduction;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        in array list after initializing the 2D arraylist by using keyword new we can initialize only row not column so to assign the
//        memory for column we have to initialize using new keyword again
//        [[1, 2, 3], [4, 1, 2], [3, 4, 1], [2, 3, 4]]
//        above is output for this below snippet
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
//                list.add(in.nextInt());
//                list.get(i);
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

        //single arrayList
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i = 0; i <5 ; i++) {
//            list.add(in.nextInt());
//        }
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println(list);

    }
}
