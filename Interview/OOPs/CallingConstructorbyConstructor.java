package com.Interview.OOPs;
/**How to call one constructor from the other constructor*/
public class CallingConstructorbyConstructor {
    CallingConstructorbyConstructor(){
        System.out.println("This is a default constructor");

    }
    CallingConstructorbyConstructor(int val){
        this();
        System.out.println("This is a parameterized constructor");
    }
    public static void main(String[] args){
        CallingConstructorbyConstructor c=new CallingConstructorbyConstructor(10);

    }
}