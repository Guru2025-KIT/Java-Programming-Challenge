import java.lang.*;
import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){

        System.out.println("ENter Number to Check if it is Prime or Not: ");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();

        boolean isprime=prime(num);
        if(isprime){
        System.out.print(num+" is Prime.");
        }else{
        System.out.print(num+" is not Prime.");
        }
    }


    public static boolean prime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

}