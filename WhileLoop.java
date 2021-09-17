/*

            ** Syntax **

    while (Test_Expression)
    {
       // statements

      Update_Expression;
    }

    1. Test_Expression: In test expression,it test the condition.
    2. Update_Expression: After executing the loop body, update expression
       will increments/decrements the loop variable by some new value.
 */


public class WhileLoop {
    public static void main(String[] args) {
        LoopWhile lw = new LoopWhile();
        lw.while_loop();
    }
}

class LoopWhile{
    int countUpTo = 5;
    int countStart = 1;

    public void while_loop(){

        while(countStart <= countUpTo){
            System.out.println(countStart + " - While Loop Testing");
            countStart++;
        }
    }
}
