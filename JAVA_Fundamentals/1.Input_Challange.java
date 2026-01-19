import java.lang.*;
import java.util.Scanner;

public class Input_Challange3{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.print("Please Enter Your Name: ");
        String name=input.nextLine();

        System.out.print(name+", Also Enter Your Age: ");
        int age=input.nextInt();

        System.out.println("Hello  "+ name+"! \nYour Age is: "+age+"\n\n");

        System.out.print("ENter First Number: ");
        int num1=input.nextInt();
        System.out.print("ENter Second Number: ");
        float num2=input.nextFloat();

        System.out.print("\nSum of "+num1+" & "+num2+" is "+(num1+num2));

    }
}