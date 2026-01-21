import java.lang.*;
import java.util.Scanner;

public class NumberOfOccurences{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=inputArray();
        display(arr);
        System.out.print("\nEnter Target Element: ");
        Scanner input=new Scanner(System.in);
        int target=input.nextInt();
    

        int occurence=frequency(target,arr);
        System.out.print(target+" Occurs "+occurence+" times.");

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

    public static int frequency(int target,int[] arr){
        int count=0,i=0;
        while(i<arr.length){
            if(arr[i]==target){
                count++;

            }
            i++;
        }
        return count;
    }

}