package com.arrayIntroduction;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3},//0th index
//                {4, 5},  //1st index
//                {6, 7, 8, 9}// 2nd index ->arr[2]={6,7,8,9} and arr[2][0]=6
//        };
//        int[][] arr=new int[3][3];
//        for (int row = 0; row <arr.length ; row++) {//arr.length it will give number of row
//            for (int col = 0; col < arr[row].length; col++) { //arr[row].length gives number of column or element in row
//                arr[row][col]=in.nextInt();
//            }
//        }

        //Simple method to print
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //print using Arrays.toString method
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //using enhanced method
//        for(int[] a:arr)
//            System.out.println(Arrays.toString(a));
        int[] arr = {1, 2, 3, 4};
        for (int i : arr)
            System.out.print(i + " ");
    }
}