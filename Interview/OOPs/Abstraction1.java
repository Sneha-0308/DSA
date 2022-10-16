package com.Interview.OOPs;

//blueprint also called as Base class / parent class
abstract class Animal{
    /**we can also create the constructor for abstract class**/
    Animal(){
        System.out.println("This is Animal constructor");

    }
   //this class is basic animal functionality class it will not have any specific walk() or another method it just general class which has common functions one animal should have so this class we can make it as Abstract because general function should not be changed we can change our particular animal like horse class but not Base class because it is common for all class For example BaseModel class in SpringBoot for DataBase**/

    //    public void walk(){  because it does not have any implementation we can make this method as abstract
//    }
    /**we can create abstract method inside abstract class**/
    abstract void walk();

    /**we can also create non-abstract method**/
    public void eat(){
        System.out.println("Animal eats");
    }

    //so if the abstract class has the final method you can not override that method check in Horse class Shape() function
    final void shape(){
        System.out.println("Shape of animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("This is Horse constructor");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
// this gives error because it can not be over ride because it is final method
//    public void shape(){
//        System.out.println("Shape of Horse");
//    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction1 {
    public static void main(String[] args){
        /**Constructor chaining*/
        Horse h=new Horse();
        h.walk();
//        Animal a=new Animal();  this will give error because we can not create object of abstract class error is:abstract class cannot be instantiated
//        a.walk();
        /**this type of error is called Run time error*/
        h.eat();
    }
}


/**Most of the oops related code shows the error at run time not at to compile time, so we have to carefully use the oops concepts**/