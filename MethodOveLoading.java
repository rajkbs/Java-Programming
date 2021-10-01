public class MethodOveLoading {
    public static void main(String[] args) {

        OverLoadingTest olt = new OverLoadingTest();

        olt.display("Thank You");
        olt.addIntNumber(25, 30);
        olt.addIntNumber(25, 30, 20);
        olt.addIntNumber(23, 30, 49, 18);
    }
}

class OverLoadingTest{
    int result;
    //Methods
    public void display(){
        System.out.println("This method takes no parameter");
    }

    public void display(String msg){
        System.out.println("This method takes : " + msg);
    }

    public int number(int arg1){
        System.out.println("One arguments in method add : " + arg1);
        return 0;
    }

    public int addIntNumber(int arg1, int arg2){
        result = arg1 + arg2;
        System.out.println("Addition result : " + result);
        return 0;
    }

    public int addIntNumber(int arg1, int arg2, int arg3){
        result = arg1 + arg2 + arg2;
        System.out.println("Addition result : " + result);
        return 0;
    }

    public int addIntNumber(int arg1, int arg2, int arg3, int arg4){
        result = arg1 + arg2 + arg2 + arg3 + arg4;
        System.out.println("Addition result : " + result);
        return 0;
    }
}
