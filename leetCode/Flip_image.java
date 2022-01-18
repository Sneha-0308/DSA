package com.leetCode;

import java.util.Arrays;

public class Flip_image {
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] ref = new int[image.length][image.length];
        int[][] res = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0, k = image.length - 1; j < image.length; j++, k--) {
                ref[i][j] = image[i][k];
                if (ref[i][j] == 1)
                    res[i][j] = 0;
                else
                    res[i][j] = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] ans = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
