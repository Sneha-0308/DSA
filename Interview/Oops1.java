package com.Interview;

/***Pen class is blueprint class that is it does not exist physically only logic is present **/
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printProperty(){
        System.out.println(this.color); /***this keyword will be replaced with the current object called***/
        System.out.println(this.type);
    }


    /**CONSTRUCTOR and ITS TYPES**/
    //1.NON PARAMETERIZED CONSTRUCTOR
    Pen(){
        System.out.println("Object is created that's why constructor is called");
    }

    //2.PARAMETERIZED CONSTRUCTOR
//    Pen(String color,String type){
//        this.color=color;  //instead of assigning values we can direct pass the values Pen pen1=new Pen("blue","gel");
//        this.type=type;
//    this.class_variable=passed_variable;
//    }

//    3.COPY CONSTRUCTOR
//    Pen(Pen p1){
//        this.color=p1.color;
//        this.type=p1.type;
//    }
}
public class Oops1 {
    public static void main(String[] args){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();

        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ballpoint";

        pen1.printProperty();  /**when we call this function this will be replaced by the object which is called the function*/
        pen2.printProperty();
    }
}





/**this main function to run the copy constructor*/
//public class Oops1{
//    public static void main(String[] args){
//        Pen p1=new Pen();
//        p1.color="black";
//        p1.type="ball pen";
//
//        Pen p2=new Pen(p1); //this copies the one constructor into another first creat the object and assign the value then pass that object into constructor of another object
//        p2.printProperty();
//    }

//}
