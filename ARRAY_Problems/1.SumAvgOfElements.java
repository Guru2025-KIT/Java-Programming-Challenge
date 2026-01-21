import java.lang.*;
import java.util.Scanner;

public class SumAvgOfElements{
    public static void main(String[] args){

        System.out.print("Enter the Array Elements:\n");
        int[] arr=inputArray();
        display(arr);
        SumAvg(arr);

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

    public static void SumAvg(int[] arr){
        int sum=0,i=0;
        float avg=0.0f;

        while(i<arr.length){
            sum+=arr[i];
            i++;
        }

        avg=sum/arr.length;

        System.out.print("\nSum of Array Elements: "+sum+"\nAverage of Array Elements: "+avg);
    }
}