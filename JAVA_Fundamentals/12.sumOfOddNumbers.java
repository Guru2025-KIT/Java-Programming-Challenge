import java.lang.*;
import java.util.Scanner;

public class sumOfOddNumbers{
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number upto which you Want the odd numbers:");
        int range=input.nextInt();

        int result= sumOdd(range);
        System.out.print("Sum of all Odd numbers from 1 to "+range+" is "+result);
    }

    public static int sumOdd(int range){
        int i=1;
        int result=0;
        while(i<=range){
            if(i%2!=0){
                result+=i;
            }
            i++;
        }
        return result;
    }
}