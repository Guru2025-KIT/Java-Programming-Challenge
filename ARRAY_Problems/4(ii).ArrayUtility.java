import java.util.Scanner;

public class ArrayUtility{
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