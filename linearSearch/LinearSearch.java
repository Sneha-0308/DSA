package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 45};
        int target = 123;
        System.out.println(findElement(arr, target));
    }

    static int findElement(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index])
                return index;
        }
        return -1;
    }
}
