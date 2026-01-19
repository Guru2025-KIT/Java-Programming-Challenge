import java.lang.*;
import java.util.Scanner;

public class reverseDigit{
    public static void main(String[] args){
        System.out.print("Enter the Number to reverse: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int reversed=reversed(num);
        System.out.print("Reversed of "+num+" is "+reversed);
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