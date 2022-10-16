package com.Interview.OOPs;

import java.sql.SQLOutput;

interface Animal1{
    int eyes=2; // by default the value will be public static final
   public void walk(); //abstract methods are allowed
    // ERROR: you can not create constructor of interface class
//    Animal1(){
//    }

    // ERROR: you can not implement method in interface class only abstract methods are allowed
//    public void eat1(){
//    }
}

interface Herbivore{

}
/**MULTIPLE INHERITANCE**/
class horse1 implements Animal1,Herbivore{
//    in interface class we have created a method and this is implemented here
   //TODO: Always the method that implement the abstract method should be public or else it shows error
    public void walk(){
        System.out.println("walks on 4 legs");
    }

}
public class Interfaces1 {
}
