import java.util.Scanner;

public class Greatest_Even_Absolute{
    public static void main(String[] args){
        System.out.println("Ternary Operator Use Cases: ");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Integre: ");
        int num1=input.nextInt();
        System.out.print("Enter Second Integre: ");
        int num2=input.nextInt();


        //Greatest of two numbers.
        int greatest= (num1>num2)?num1:num2;
        System.out.println("Greatest of Two numbers is:"+greatest);


        //Even or Odd.
        
        //Even or Odd (FIXED: Ternary result passed into println)
        // In Java, ternary operators cannot execute void methods as branches.
        System.out.println(num1+" is "+ ((num1%2==0) ? "Even":"Odd"));
        System.out.println(num2+" is "+ ((num2%2==0) ? "Even":"Odd"));

        



        //Absolute value.
        int absolute1= num1<0 ? (-num1):num1;
        System.out.println("Absolute Value of "+num1+" is "+absolute1);
        int absolute2=num2<0 ? (-num2):num2;
        System.out.println("Absolute Value of "+num2+" is "+absolute2);




    input.close();




    }
}