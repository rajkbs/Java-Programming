package Beginners;


/*
* 7 non access modifiers
*   1. static
*   2. final
*   3. abstract
*   4. volatile
*   5. native
*   6. synchronized
*   7. transient
* */
public class NonAccessModifiers {

    /*public static void messageTwo(){
        System.out.println("Inside a class which contain main method");
    }*/
    public static void main(String[] args) {

      //  messageTwo();

        //use class name
       // StaticNonAccModifier.messageStatic();

        StaticNonAccModifier obj = new StaticNonAccModifier();

        //obj.msg();
       // System.out.println("Value of a after multiplication : " + StaticNonAccModifier.a);
    }
}

//class for static non access modifier
class StaticNonAccModifier {

    static int a = 20;
    static int b = 30;

    StaticNonAccModifier(){
        System.out.println("Inside constructor");
    }

    public static void messageStatic(){
        System.out.println("Inside messageStatic method : " + b);
    }

    //Non static fields can not be used inside static block, static method
    static {
        a = a * 10;
        System.out.println("Product : " + a);
       // messageStatic();
    }

    public void msg(){
        System.out.println("Non static message");
    }
}

//class for final non access modifier


//class for volatile non access modifier


//class for native non access modifier


//class for synchronized non access modifier


//class for transient non access modifier