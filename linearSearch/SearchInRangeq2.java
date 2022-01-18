package com.linearSearch;

public class SearchInRangeq2 {
    /*This search is for integer input*/
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        int target=5;
//        System.out.println(search(arr,target,0,3));
//    }
//    static int search(int[] arr,int target,int start,int end)
//    {
//        if(arr.length==0)
//            return -1;
//        for (int i = start; i <=end ; i++) {
//            if(target==arr[i])
//                return i;
//        }
//        return -1;
//    }

    /*This search is for String input*/
    public static void main(String[] args) {
        String name = "sneha";
        char target = 'a';
        System.out.println(search(name, target, 0, 3));
    }

    static boolean search(String name, char target, int start, int end) {
        if (name.length() == 0)
            return false;
        for (int i = start; i <= end; i++) { //We cannot use for each loop here because we are using index that is range
            // is mention here and we are not iterating the full array so
            if (target == name.charAt(i))   //charAt(index) -->to know which character is present at mentioned index
                return true;             //toCharArray -->to make String in array format in whole
        }
        return false;
    }
}
