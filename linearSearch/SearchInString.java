package com.linearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "sneha";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));//name.toCharArray() method used to convert String to character array
        System.out.println(search(name, target));
    }

    //    static boolean search(String name,char target)
//    {
//        if(name.length()==0)
//            return false;
//        for (int index = 0; index <name.length() ; index++) {
//            if(target==name.charAt(index))
//                return true;
//        }
//        return false;
//    }
    static boolean search(String name, char target) {
        if (name.length() == 0)  //to find length of String we use .length() method
            return false;
        for (char index : name.toCharArray())  //datatype in for each loop is datatype of element stored in array
        {                                   //for(int i:arr)   by comparing both loops we can say that datatype is char
            if (target == index)               //i =index   arr=name.toCharArray() -->this is name of array after splitting the String
                return true;
        }
        return false;
    }
}
