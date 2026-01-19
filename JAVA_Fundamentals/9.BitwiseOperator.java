import java.lang.*;
import java.util.Scanner;

public class BitwiseOperator{
public static void main(String[] args){

    Scanner input=new Scanner(System.in);

    System.out.print("Enter First Number to perform Bitwise Operations:");
    int num1=input.nextInt();
    System.out.print("Enter Second Number to perform Bitwise Operations:");
    int num2=input.nextInt();

    int result=0;
    //Bitwise AND.
    result= num1 & num2;
    System.out.print("\nAnd of "+num1+" & "+num2+" is "+result);

    //Bitwise OR.
    result= num1 | num2;
    System.out.print("\nOR of "+num1+" & "+num2+" is "+result);

    //Bitwise X-OR.
    result= num1 ^ num2;
    System.out.print("\nX-OR of "+num1+" & "+num2+" is "+result);

    //Bitwise not.
    result= ~num1;
    System.out.print("\nNot of "+num1+" is "+result);

    //Left shift.(Multiple by 2 for each step)
    result= num1<<1;
    System.out.print("\nLeft shift of "+num1+" is "+result);

    //Right shift.(Divide by 2 for each step)
    result= num1>>1;
    System.out.print("\nRight shift of "+num1+" is "+result);
}
}