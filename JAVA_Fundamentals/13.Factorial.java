import java.lang.*;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        System.out.print("Enter Number to Calculate Factorial: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int result=fact(num);
        System.out.print("Factorial of "+num+" is "+result);
    }

    public static int fact(int num){
        int i=1;
        int fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}