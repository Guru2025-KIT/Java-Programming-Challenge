import java.lang.*;
import java.util.Scanner;

public class Greatest_of_Three{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1=input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2=input.nextInt();

        System.out.print("Enter Third Number: ");
        int num3=input.nextInt();       
    
        //Logic.
        if(num1>num2){
            if(num1>num3){
                System.out.print(num1+" is greatest.");
            }else{
                System.out.print(num3+" is greatest.");
            }
        }else{
            if(num2>num3)
                System.out.print(num2+" is greatest."); 
            else
                System.out.print(num3+" is greatest."); 

        }
    }
}