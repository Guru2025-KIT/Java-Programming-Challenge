import java.lang.*;
import java.util.Scanner;

public class MaxMinElement{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=inputArray();
        display(arr);

    
        minMax(arr);

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

    public static void minMax(int[] arr){
        int i=0;
        int min=arr[i],max=arr[i];
       

        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        System.out.print("\n\nMinimum Element:"+min+" \nMaximum Element:"+max);
    }
}