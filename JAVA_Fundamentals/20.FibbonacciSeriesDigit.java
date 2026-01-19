import java.lang.*;
import java.util.Scanner;

public class FibbonacciSeriesDigit{
    public static void main(String[] args){
        System.out.print("Enter the Number up to which you Want the Series: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        fibbo(num);
    }

    public static void fibbo(int num){
        if(num<0){
            System.out.print("0 ");
            return ;
        }else if(num==0){
            System.out.print("1 ");
            return ;            
        }else{
            int first=0, second=1;
            while((first+second)<=num){
                int third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;
            }
        }
    }
}