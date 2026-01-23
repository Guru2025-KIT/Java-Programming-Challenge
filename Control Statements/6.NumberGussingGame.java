import java.util.Scanner;

public class NumberGussingGame{
    public static void main(String[] args){
        System.out.println("--\tWelcome in Number Gussing Game\t--");
        int number=100;

        Scanner input=new Scanner(System.in);
        int count=0;
        int guessed=0;

        do{
            System.out.print("\nGuess The Number: ");
            guessed=input.nextInt();
            if(guessed>number){
                System.out.print("Guess Smaller.");
            }else if(guessed<number){
                System.out.print("Guess Bigger.");
            }
            count++;
        }while(number!=guessed);

        System.out.println("The Number is Matched: "+number+"\nTotal attempts:"+count);
    }
}