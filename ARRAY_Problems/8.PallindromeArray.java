import java.util.Scanner;

public class Pallindrome{
    public static void main(String[] args){
        System.out.println("Enter Elements of Array: ");
        int[] arr=ArrayUtility.inputArray();

        if(ispallindrome(arr)){
            System.out.println("Array is Pallindrome.");
        }else{
            System.out.println("Array is not a Pallindrome.");

        }
 
    }

    public static boolean ispallindrome(int[] arr){
        int i=0;
        int j=(arr.length-1);
        int temp=0;
    
        while(i<j){

            if(arr[i]==arr[j]){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}