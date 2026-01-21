import java.lang.*;
import java.util.Scanner;

public class SortedOrNot{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=inputArray();
        display(arr);
       

        boolean isSorted=checkif(arr);
        if(isSorted){
            System.out.print("\nArray Is Sorted.");
        }else{
            System.out.print("\nArray Is Not Sorted.");

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

    public static boolean checkif(int[] arr){
        int i=0;
        boolean issorted=true;

        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
            }
        }
        return issorted;
    }
}