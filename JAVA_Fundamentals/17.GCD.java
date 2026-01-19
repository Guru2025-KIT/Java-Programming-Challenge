import java.lang.*;
import java.util.Scanner;

public class GCD{
    public static void main(String[] args){

        System.out.println("Welcome in Greatest Common Divisor Program:");
        int num1=inputNum();
        int num2=inputNum();

        int GCD=GCD(num1,num2);
        System.out.println("GCD of "+num1+" & "+num2+" is "+GCD);

    }

    public static int inputNum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        return num;
    }

    public static int GCD(int num1,int num2){
        int gcd=1,i=2;
        int least=least(num1,num2);
        while(i<=least){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int num1,int num2){
        if(num1>num2){
            return num2;
        }else{
            return num1;
        }
    }
}