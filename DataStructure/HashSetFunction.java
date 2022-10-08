package com.DataStructure;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetFunction {
    public static void main(String[] args){
//        hashset stores the value randomly
//         The class does not guarantee the constant order of elements over time but permits the null element.
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

//        we can add only unique value if the value is already present then it will not add and returns the false
//        if value is not present then it will add that value to hash table and returns true
        hashSet.add(4);
        boolean b=hashSet.add(45);
        System.out.println(b);
//        you can remove element by passing the value
        hashSet.remove(1);
        System.out.println(hashSet);
//        to access the hashset value you can convert that into array then use
        Object[] arr=hashSet.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
