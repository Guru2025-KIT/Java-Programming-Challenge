import java.lang.*;
import java.util.Scanner;

public class LCM1{
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
        
        int result=0;
        int greater;
        if(num1>num2){
            greater=num1;
        }else{
            greater=num2;
        }

        while(true){
            if((greater%num1==0 && greater%num2==0)){
                result=greater;
                break;
            }
            greater++;

        }
      return result;  
    }
}