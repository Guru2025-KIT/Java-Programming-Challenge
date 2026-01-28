import java.util.Scanner;
public class Guess_Game {

    public static void main(String[] args) {
        int rand=(int)(Math.random()*50);
        int plays=0;
        Scanner input= new Scanner(System.in);
        int CurrentTry;
        do{
            System.out.print("Enter Your Guess:");
            CurrentTry=input.nextInt();
            if(rand<CurrentTry){
                System.out.println("\nAttempt Failed! Try Again!\nGuess Lower!");
            }else{
                System.out.println("\nAttempt Failed! Try Again!\nGuess Higher!");

            }
            plays++;
        }while(rand!=CurrentTry);

        System.out.printf("\nCorrect Guess!\n%d",CurrentTry);
        System.out.printf("\nTotal Attempts:%d",plays);

        input.close();

    }
    
    
}
