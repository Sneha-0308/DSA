package com.leetCode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Kids_with_the_greatest_number_of_candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {
        Kids_with_the_greatest_number_of_candies s = new Kids_with_the_greatest_number_of_candies();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] candies = new int[n];
        if (n != candies.length)
            System.exit(0);
        if (n < 2 || n > 100)
            System.exit(0);
        int extraCandies = in.nextInt();
        if (extraCandies < 1 || extraCandies > 50)
            System.exit(0);
        for (int i = 0; i < n; i++) {
            candies[i] = in.nextInt();
            if (candies[i] < 1 || candies[i] > 100)
                System.exit(0);
        }
        List<Boolean> res = s.kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }
}
