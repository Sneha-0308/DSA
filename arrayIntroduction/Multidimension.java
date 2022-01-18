package com.arrayIntroduction;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
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
