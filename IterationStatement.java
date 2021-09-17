public class IterationStatement {
    public static void main(String[] args) {
        Testing ts = new Testing();
        //ts.forLoop();
        ts.forEachLoop();
    }
}

class Testing{
    int num = 10;
    int i, j;

    int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

   /* public void forLoop(){
        int c = 0;
        for(int i = 1; i <= num; i++ ){
            c++;
            if (i == 5){
                break;
            }
            System.out.print(i + " ");
           // System.out.println(i);
        }
        System.out.println("Iteration it completes is : " + c);
        System.out.print("hai");
    }*/

    public void forEachLoop(){

        //Syntax: for(datatype variable_name : array_name)
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
/*
    public void forLoopTwo(){
        for(i = 0, j = 10; i < j; i++, j--){
            System.out.println("i and j: " + i + " " + j);
        }
    } */
}
