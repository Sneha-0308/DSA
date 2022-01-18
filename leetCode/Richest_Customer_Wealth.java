package com.leetCode;

import java.util.Scanner;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int value = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                value = value + accounts[i][j];
            }
            if (value > wealth)
                wealth = value;
        }
        return wealth;
    }

    public static void main(String[] args) {
        Richest_Customer_Wealth s = new Richest_Customer_Wealth();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] accounts = new int[m][n];
        if (m < 1 || n > 50)
            System.exit(0);
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                if (m != accounts.length || n != accounts[i].length)
                    System.exit(0);
                accounts[i][j] = in.nextInt();
                if (accounts[i][j] < 1 || accounts[i][j] > 100)
                    System.exit(0);
            }
        }
        System.out.println(s.maximumWealth(accounts));
    }
}
