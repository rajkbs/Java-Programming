/*

    *** Do While Loop ***

    do {
         statement(s)
    } while (expression);


    1.  The difference between do-while and while is that do-while
        evaluates its expression at the bottom of the loop instead of the top.
    2.  The statements within the do block are always executed at least once.

 */

public class DoWhileLoop {

    public static void main(String[] args) {
        LoopDoWhile ldw = new LoopDoWhile();
        ldw.do_while_loop();
    }
}

class LoopDoWhile{

    int countUpTo = 5;
    int countStart = 1;
    int cnt = 0;

    public void do_while_loop(){
        do{
            cnt++;
            System.out.println(countStart + " - Do While Loop Testing");
            countStart++;
        }while(countStart <= countUpTo);
        System.out.println("Total Count : " + cnt);
    }
}
