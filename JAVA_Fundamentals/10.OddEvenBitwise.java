import java.lang.*;
import java.util.Scanner;

public class OddEvenBitwise{
    public static void main(String[] args){
        System.out.print("Enter Number To check if it is Odd or Even Using Bitwise:");

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

    
        //Logic->if bitwise and with one is one then odd. 1010 & 0001=>0000 -->even
        if(((num & 1)==1))
            System.out.print(num+ " is odd.");
        else
            System.out.print(num+ " is Even.");

    }
}