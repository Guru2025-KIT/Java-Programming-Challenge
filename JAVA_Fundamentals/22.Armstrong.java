import java.lang.*;
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        System.out.print("Enter the Number to check if it Armastrong or Not: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        boolean isarmastrong=armastrong(num);

        if(isarmastrong){
            System.out.print(num+" is an Armastrong Number.");
        }else{
            System.out.print(num+" is not an Armastrong Number.");

        }

    }

    public static boolean armastrong(int num){
        int temp=num;
        int result=0;
        while(temp!=0){
            int digit=temp%10;
            result+=pow(digit,noDigits(num));
            temp/=10;
        }
        return result==num;
    }

    public static int noDigits(int num){
        int digits=0;
        while(num!=0){
            digits++;
            num/=10;
        }
        return digits;
    }

    public static int pow(int digit,int expo){
        int result=1;
        while(expo!=0){
             result*=digit;
             expo--;
        }
        return result;
    }
}