import java.lang.*;
import java.util.Scanner;

public class Positive_Negative_Zero{
    public static void main(String[] args){

        System.out.print("Enter number to Check its Type: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        if(num==0){
            System.out.print(num+" is Equal to Zero.");
        }else{
            if(num>0){
                System.out.print(num+ " is Positive.");
            }else{
                System.out.print(num+ " is Negative.");
            }
        }
    }
}