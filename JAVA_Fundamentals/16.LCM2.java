import java.lang.*;
import java.util.Scanner;

public class LCM2{
    public static void main(String[] args){
        System.out.print("Welcome in the LCM program:\n");
        int num1=inputNum();
        int num2=inputNum();

        System.out.print("LCM of "+num1+" & "+num2+" is "+lcm(num1,num2));


    }

    public static int inputNum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        return num;
    }

    public static int lcm(int num1,int num2){
        
        int i=1;
        while(true){
            int factor=num1*i;
            if(factor%num2==0){
                return factor;
            }
            i++;
        }
        //return 0; -------->not needed on VS code.
    }
}