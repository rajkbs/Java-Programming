/*
*  Variable Program
*  Prepared by : BCA 3rd Year Lab Work
*  VariableProgram.java
*  Date:30-07-2021
* */

//Package Name
package Beginners;

/*
*   Variables are three types
*        1. Local Variable
*        2. Instance Variable
*        3. Class / Static variable
* */

// This class contain main function
public class VariableProgram {
    public static void main(String args[]){
        System.out.println("Hello World !");

        Testing obj = new Testing();
        obj.message();
        System.out.println("B is called with an object : " + obj.b);
        obj.getValue();
        System.out.println("Static Variable without object : " + Testing.c);
    }
}

class Testing{

    public int b;             // Instance Variable
    static int c = 85;             // class or static variable

    //Constructor
    Testing(){
        b = 23;
    }
    public void message(){
        int a = 45;         // Local Variable
        System.out.println("Local Variable : " + a);
        System.out.println("B value is inside message method : " + b);
    }
    public void getValue(){
        System.out.println("B value inside getValue method : " + b);
    }

}

