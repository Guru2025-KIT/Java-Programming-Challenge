import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication");
            System.out.println("4. Division\n5. Modulo\n6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = input.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter Number 1: ");
                int num1 = input.nextInt();
                System.out.print("Enter Number 2: ");
                int num2 = input.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + (num1 + num2));
                    case 2 -> System.out.println("Result: " + (num1 - num2));
                    case 3 -> System.out.println("Result: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                        else System.out.println("Error: Cannot divide by zero!");
                    }
                    case 5 -> System.out.println("Result: " + (num1 % num2));
                }
            } else if (choice != 6) {
                System.out.println("Invalid Choice! Try again.");
            }

        } while (choice != 6);

        System.out.println("Program Terminated.");
        input.close();
    }
}
