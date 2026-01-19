import java.lang.*;
import java.util.Scanner;

public class Grades{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Your Marks To determine Grade: ");
        int marks=input.nextInt();

        //Logic.
        if(marks>=90){
            System.out.print("Your Marks:"+marks+"\nYour Grade:A");
        }else if(marks>=75){
            System.out.print("Your Marks:"+marks+"\nYour Grade:B");
        }else if(marks>=60){
            System.out.print("Your Marks:"+marks+"\nYour Grade:C");
        }else if(marks>=50){
            System.out.print("Your Marks:"+marks+"\nYour Grade:D");
        }else if(marks>=40){
            System.out.print("Your Marks:"+marks+"\nYour Grade:E");
        }else{
            System.out.print("You Are Fail");

        }
    }
}