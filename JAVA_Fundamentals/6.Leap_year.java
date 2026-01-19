import java.lang.*;
import java.util.Scanner;

public class Leap_year{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

          System.out.print("Enter year to check Whether it is Leap or Not: ");
          int year=input.nextInt();

        // if(year%4==0 && year%100!=0){
        //     System.out.print(year+" Is leap year.");
        // }else{
        //     if(year%400==0){
        //         System.out.print(year+" Is leap year.");
        //     }else{
        //         System.out.print(year+" Is not a leap year.");

        //     }
        // }

        boolean isleap=((year%4==0 && year%100!=0) || (year%400==0));
        if(isleap){
            System.out.print(year+" is Leap.");
        }else{
            System.out.print(year+" is not Leap.");

        }
    }
}