import java.lang.*;
import java.util.Scanner;

public class AgeCategory{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your Age To determine Category: ");
        int age=input.nextInt();

        //Logic.
        if(age<=13){
            System.out.print("Your Age:"+age+"\nYour Category:Children");
        }else if(age<=20){
            System.out.print("Your Age:"+age+"\nYour Category:Teen");
        }else if(age<=60){
              System.out.print("Your Age:"+age+"\nYour Category:Adult");
        }else{
            System.out.print("You Are Senior Citizen");

        }
    }
}