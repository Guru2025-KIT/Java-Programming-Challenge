package LAMBDA;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class multiplyTwoNums {

    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)){
            System.out.print("Enter Number 1:");
            int num1=input.nextInt();
            System.out.print("Enter Number 2:");
            int num2=input.nextInt();

            BinaryOperator<Integer> result=(a,b)-> a*b;
            int mul=result.apply(num1, num2);
            
            System.out.printf("Multiplication of %d and %d is : %d",num1,num2,mul);
        }catch(IllegalFormatConversionException e){
            System.out.printf("\nError: %s",e.getMessage());
        }
    }
    
}
