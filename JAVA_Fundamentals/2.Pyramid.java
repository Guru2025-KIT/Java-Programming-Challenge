import java.lang.*;

public class Pyramid{
public static void main(String[] args){
    System.out.println("Good Morning!");
    System.out.println("Subscribed!");

    System.out.println("Right Half Pyramid:");
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }

   System.out.println("\nReversed Right Half Pyramid:");
    for(int i=5;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("* ");
        }
        System.out.println("");
    }
int n=5;
   System.out.println("\nLeft Half Pyramid:");
   for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print("  ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
        System.out.println("");

   }

}
}