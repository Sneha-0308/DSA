package com.arrayIntroduction;

import java.util.Arrays;
import java.util.Scanner;

public class Vid_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//       int[] rnos=new int[5]; both are one and the same
//        int[] rnos;
//        rnos=new int[5];
//        System.out.println(rnos[1]);
//        String[] arr=new String[4];
//        System.out.println(arr[0]);


        //Array of primitive
//        int[] arr=new int[5];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=in.nextInt();
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for(int i:arr)  //for each loop which is enhanced of for loop
//            System.out.print(i+" ");
//        System.out.println();
//        System.out.print(Arrays.toString(arr));
        /*If you try to access any negative index value or the index which is in the given range it will create exception arrayindexoutofbound
        for example:
         int[] arr=new int[5];
         System.out.print(arr[5]);  Gives error
         System.out.print(arr[0]);  Gives error*/


        //Array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
