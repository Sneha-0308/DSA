package com.Interview.OOPs;
/** Without main function we can print the statement by using static block in jDK 1.6 and below

 public class AStaticBlock {
 static{
 System.out.println("HEyyy");

 }
 }
 * *
 */




/*****************************************************************************************/
class Example{
    static int i;
    int j;
    //this is executed once the class is loaded into loader memory after that object can be created and once the object created then only constructor will be executed
    static{
        i=10;
        System.out.println("Value of i is "+i);
    }

    Example(){
        System.out.println("It is constructor");

    }
    public static void main(String[] args){
        Example example1=new Example();
        Example example2=new Example();
    }
}

/*****************************************************************************************/

//class Employee{
//    int id;
//    int salary;
////    String ceo;
//    static String ceo; //value of static variable will be same for all that's why it is called as static
//    void show(){
//        System.out.println(id+":"+salary+":"+ceo);
//
//    }
//    public static void main(String[] args){
//        Employee e1=new Employee();
//        e1.id=1;
//        e1.salary=1000;
//        e1.ceo="abc"; //no need of object to call static variable just use the class name Employee.ceo=""
//        Employee e2=new Employee();
//        e2.id=2;
//        e2.salary=2000;
////        e2.ceo="xyz";
//        Employee.ceo="xyz";
//        e1.show();
//        e2.show();
//    }
//
//}