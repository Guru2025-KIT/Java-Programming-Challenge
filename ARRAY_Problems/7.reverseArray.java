import java.util.Scanner;

public class reverseArray{
    public static void main(String[] args){
        System.out.println("Enter Elements of Array: ");
        int[] arr=ArrayUtility.inputArray();

        System.out.print("Original Array is: ");
        ArrayUtility.display(arr);

        System.out.print("\n\nReversed Array: ");
        ArrayUtility.display(reversed(arr));
        
    }

    public static int[] reversed(int[] arr){
        int i=0;
        int j=(arr.length-1);
        int temp=0;
        while(i<j){

            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}