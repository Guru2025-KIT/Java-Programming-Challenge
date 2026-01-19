import java.lang.*;
import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number to print it's Table: ");
        int num=input.nextInt();

        Table(num);
    }

    public static void Table(int num){
        System.out.println("Table of "+num+" is as Follow:");
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }
    }
}