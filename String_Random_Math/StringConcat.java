import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    System.out.print("Enter Your Name:");
    String name=input.next();
    System.out.print("Enter Your Last Name:");

    String Lastname=input.next();
    String Fullname=name.concat(" ").concat(Lastname).toUpperCase();
    
    System.out.println(Fullname);
    input.close();

    }
    

    
}
