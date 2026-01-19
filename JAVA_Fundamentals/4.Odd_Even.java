import java.lang.*;
import java.util.Scanner;

public class Odd_Even{
    public static void main(String[] args){

        System.out.print("Enter number to Check its Type: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        if(num%2==0){
            System.out.print(num+" is Even.");
        }else{
            System.out.print(num+ " is Odd.");
            
        }
    }
}