public class ArrayProgram {
    public static void main(String[] args) {

        int a[];
        ProgramOnArray poarr = new ProgramOnArray();
        poarr.arrayDisplay();
        poarr.arrayDataDisplay();

        a = poarr.arrayReturn();
        for (int r = 0; r < a.length; r++){
            System.out.println(a[r]);
        }
    }
}

class ProgramOnArray{

    int[] arr1;

    int[] b = new int[]{5, 8, 9, 10, 3, 6};
    int c[] = new int[]{10, 20, 30, 40};

    public void arrayDisplay(){

        for (int k : c) {               //foreach loop
            System.out.println("Value is : " + k);
        }
    }

    public void arrayDataDisplay(){

        for (int i = 0; i < c.length; i++){
            System.out.println("Value at " + i + " Location is " + c[i]);
        }
    }

    //Returning an array data from a method
    public int[] arrayReturn(){
        int x[] = new int[]{5, 8, 9, 10, 3, 6};
        return x;
    }
}

