package Array;

public class SumOfArray {
    public static void main(String[] args) {
        SumOfElements obj_soe = new SumOfElements();
        obj_soe.display();
        obj_soe.addElements();
    }
}
class SumOfElements{
    int arr[] = {11, 13, 15, 17, 19, 21, 23};
    int sum = 0;

    public void display(){
        System.out.println("Original Array Elements");
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }

    public void addElements(){
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("\nTotal Elements of an Array is : " + arr.length);
        System.out.println("Sum of all elements of an Array is : " + sum);
    }
}

Output

Original Array Elements
 11 13 15 17 19 21 23
Total Elements of an Array is : 7
Sum of all elements of an Array is : 119
