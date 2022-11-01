package com.DataStructure;
import java.util.ArrayList;
public class ArraylistDs {
    public static void main(String[] args){
//        creating array list
        ArrayList<Integer> list=new ArrayList<>();

//        Add operation list.add(elem): adds the element at the end of arraylist
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

//        Get operation
        System.out.println(list.get(0));

//        add element in between  list.add(index,elem)=this will adds the element in specified element
        list.add(0,100);
        System.out.println(list);

//        update the elem
        list.set(3,200);
        System.out.println(list);

//        delete the elem
        list.remove(1);
        System.out.println(list);
    }
}
