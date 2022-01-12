/*
* Program : Java program to sum all even and odd values of an array.
*/

package Array;

public class SumEvenOdd {
    public static void main(String[] args) {
        AdditionElements obj_ae = new AdditionElements();
        obj_ae.arrayDisplay();
        obj_ae.addition();
    }
}
class AdditionElements{
    int arr[] = {10, 5, 8, 7, 3, 2};
    int sumEven,sumOdd;

    public void arrayDisplay(){
        System.out.println("Array Elements are");
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }
    public void addition(){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sumEven = sumEven + arr[i];
            }else{
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("\nAddition of Even Element of an Array : " + sumEven);
        System.out.println("Addition of Odd Element if an Array : " + sumOdd);
    }
}

Output : 
Array Elements are
 10 5 8 7 3 2
Addition of Even Element of an Array : 20
Addition of Odd Element if an Array : 15
  
