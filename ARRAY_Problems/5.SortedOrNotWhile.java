import java.lang.*;
import java.util.Scanner;

public class SortedOrNotWhile{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=inputArray();
        display(arr);
       

       if(isIncreasing(arr) || iszDecreasing(arr)){
            System.out.print("\nArray Is Sorted.");
       }else{
            System.out.print("\nArray Is not Sorted.");

       }

    }

    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int range=input.nextInt();

        int[] arr=new int[range];

        int i=0;
        while(i<range){
            System.out.print("Enter "+(i+1)+" Element: ");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;

    }

    public static void display(int[] arr){
        System.out.print("\nArray Elements Are: ");
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

//Is array is in increasing order.
    public static boolean isIncreasing(int[] arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

//Is array is in decreasing order.
    public static boolean iszDecreasing(int[] arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}