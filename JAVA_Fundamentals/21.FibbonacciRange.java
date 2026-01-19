import java.lang.*;
import java.util.Scanner;

public class FibbonacciRange{
    public static void main(String[] args){
        System.out.print("Enter the Range of  the Series: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        fibbo(num);
    }

    public static void fibbo(int num){
        if(num<0){
            System.out.print("0 ");
            return ;
        }
        if(num==0){
            System.out.print("1 ");
            return ;            
        }
            int first=0, second=1,i=1;
            System.out.print(first+" ");
            while(i<num){
                int third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;
                i++;
            }
        }
    
}