package automata;
import java.util.Scanner;

public class BinaryStringValidatorA58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String str = input.nextLine();

        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Valid binary string.");
        } else {
            System.out.println("Invalid binary string. It should contain only 0s and 1s.");
        }

        input.close();
    }
}
