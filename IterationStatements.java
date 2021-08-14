package Beginners;

public class IterationStatements {

    public static void main(String[] args) {
        TestingIteration ti;
        ti = new TestingIteration();

        ti.forLoop();
        ti.whileLoop();
        ti.breakStatement();
        ti.continueStatement();
    }
}

class TestingIteration {

    //For Loop

    /* for(initialize; condition; Inc / Dec){
            Statements
        }
    */

    /* for-each loop
        for(Type var:array){
            statements
        }
    */

    /* Labelled For Loop
        labelname:
        for(initialize; condition; inc/dec){
            statements
        }
     */

    public void forLoop(){
        //print a numbers from 1 to 20
        int counter = 0;

        for(int i = 1; i <= 10; i++){
           if ( i % 2 == 0){
               counter = counter + 1;  // counter++
           }
        }
        System.out.println("Total Numbers of even number : " + counter);
    }

    //While Loop
    /*
        initialize
        while(condition){

            statements;
            update_expression;
        }
     */
    public void whileLoop(){

        //print Hello Java for 5 times
        //print total number of odd from 1 to 20
        int count = 0;
        int i = 1;
        while(i <= 20){
            if (i % 2 != 0){
                count++;
            }

            //System.out.println(i + " Hello Java from while loop");
            i++;
        }
        System.out.println("Total Number is : " + count);
    }

    //Do-While Loop

    /*
        do{
            statement;
            updation
        }while (condition);

     */

    /*
       JUMP Statement
       1. break statement
           used to break the loop and switch statement. it break the current flow of program
                        syntax   break;
       2. continue statement
           used to continue the current flow of the program. it skips the remaining code at specific condition.
                        syntax   continue;

     */
    public void breakStatement(){
        int count = 0;
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0) {
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Count value is : " + count);
    }

    public void continueStatement(){
        for(int i = 0; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
