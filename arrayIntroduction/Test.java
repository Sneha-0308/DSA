package com.arrayIntroduction;

import java.util.LinkedList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<List<Integer>> list =new LinkedList<>();
        List<Integer> list1=new LinkedList<>();
        list1.add(0);
        list1.add(0);
        list.add(list1);
        List<Integer> list2=new LinkedList<>();
        list2.add(0);
        list2.add(1);
        for(int i=0;i<list.size();i++){
            if(!list.get(i).equals(list2))
                list.add(list2);
        }
        System.out.println(list.toString());

    }
}