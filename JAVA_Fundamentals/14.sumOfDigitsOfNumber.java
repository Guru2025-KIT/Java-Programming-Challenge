import java.lang.*;
import java.util.Scanner;

public class sumOfDigitsOfNumber{
    public static void main(String[] args){
        System.out.print("Enter Number to Calculate Sum of Digits: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int result=sumDigit(num);
        System.out.print("Sum of  Digits of "+num+" is "+result);
    }

    public static int sumDigit(int num){
       int temp=num;
       int digit=0,result=0;
       while(temp!=0){
        digit=temp%10;
        result+=digit;
        temp/=10;
       }
       return result;
    }
}