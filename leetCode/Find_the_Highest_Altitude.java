package com.leetCode;

public class Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = gain[i] + altitudes[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= gain.length; i++) {
            if (altitudes[i] > max)
                max = altitudes[i];
        }
        return max;
    }
}
