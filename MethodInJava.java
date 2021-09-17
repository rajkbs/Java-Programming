
/*
    *** Method in Java ***

    1. Method has a group of statements.
    2. Re Usability of block of code minimizes redundancy.
    3. A class may have multiple methods.
    4. A method returns a null or a value using the return statement.
    *

    **** Syntax ****

    access_specifier return_type function_name( arguments..){
	    Statements;
	    Return statement;
    }

 */

public class MethodInJava {

    public static void main(String[] args) {
        int add;
        int number = 12;
        String msg = "Inside Message";
        String str;
        JavaInMethod jim = new JavaInMethod();
        jim.number();
        add = jim.addition(number);
        str = jim.message(msg);
        System.out.println("Addition : " + add);
        System.out.println("Message : " + str);
    }
}

class JavaInMethod{

    int number = 10;

    public void number(){
        System.out.println("Number : " + number);
    }

    public int addition(int num){
        int result = num + 35;
        return result;
    }

    public String message(String msg){
        return msg;
    }

}
