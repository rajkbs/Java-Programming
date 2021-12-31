/*
* Program : Java Program to sort a numeric Array
* */

package Array;

public class SortingNumericArray {
    public static void main(String[] args) {
        SortingArray objsa = new SortingArray();
        objsa.displayArray();
        objsa.sortingInAscendingOrder();
        objsa.sortingInDescendingOrder();
    }
}

class SortingArray{
    int arr[] = {12, 2, 22, 18, 30, 5, 10};
    int temp = 0;

    public void displayArray(){
        System.out.println("Original Array <unsorted>");
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }

    //Code for sorting an array in ascending order
    public void sortingInAscendingOrder(){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n After Ascending : ");
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }

    // Code for sorting an array in descending order
    public void sortingInDescendingOrder(){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n After Descending :");
        for (int x : arr) {
            System.out.print(" " + x);
        }
    }
}

Output:
Original Array <unsorted>
 12 2 22 18 30 5 10
 After Ascending : 
 2 5 10 12 18 22 30
 After Descending :
 30 22 18 12 10 5 2
