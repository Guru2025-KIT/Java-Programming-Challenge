import java.lang.*;
import java.util.Scanner;

public class PallindromeNumber{
    public static void main(String[] args){
        System.out.print("Enter the Number to Check if it Pallindrome or not: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        boolean reversed=(reversed(num)==num);
        if(reversed){
            System.out.print(num+" is a Pallindrome.");
        }else{
            System.out.print(num+" is not a Pallindrome.");
        }
        
    }

    public static int reversed(int num){
        int temp=num;
        int reverse=0;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }

        return reverse;
    }
}