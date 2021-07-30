/*
* Demonstrate of Modifiers in Java
* Programmed for : Lab Work
* Modifiers.java
* Date:31-7-2021
* */

package Beginners;

// Access Control Modifiers

class AccessCtrlModifiers{

    public int plbm = 23;            // public modifiers
    private int prvm = 10;          // private modifiers
    protected int pctm = 85;        // protected modifiers
    protected int pctma;

    protected AccessCtrlModifiers(){
        System.out.println("Inside constructor");
    }
    public int getValue(){
        return prvm;
    }
}

// This class contain Main function
public class Modifiers {

    public static void main(String[] args) {
        System.out.println("Program to demonstrate Modifiers");

        // object creation for ModifiersTesting class
        AccessCtrlModifiers obj = new AccessCtrlModifiers();

        //Access public variable of AccessCtrlModifiers class
        System.out.println("public access control modifiers : " + obj.plbm);

        //Access private variable of AccessCtrlModifiers class
        //System.out.println("private access control modifiers : " + obj.prvm);
        //'prvm' has private access in 'Beginners.AccessCtrlModifiers'

        //Access protected variable of AccessCtrlModifiers class
        System.out.println("protected access control modifiers : " + obj.pctm);

        //Access private variable of AccessCtrlModifiers class using method
        System.out.println("private access control modifiers with method : " + obj.getValue());

        obj.pctma = 35;
    }
}


// OUTPUT
/*
* Program to demonstrate Modifiers
* public access control modifiers : 23
* protected access control modifiers : 85
* private access control modifiers with method : 10
* */
