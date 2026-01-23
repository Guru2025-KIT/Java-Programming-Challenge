import java.util.Scanner;

public class Passward_Setter{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String passward;
        int i=0;
    do{
        System.out.print("Enter Your Passward(Atleat 6 char):");
        passward=input.next();
    }while(!isValid(passward));
     System.out.println("Your Passward is Set:");
    }

    public static boolean isValid(String passward){
        return passward.length()>6;
    }
}
