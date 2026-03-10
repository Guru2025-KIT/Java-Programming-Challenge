package algorithms;

import java.util.Scanner;

public class LinearSearchA58{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int key;
        int position = -1;

        System.out.print("\nEnter element to search: ");
        key = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position: " + (position + 1));
        } else {
            System.out.println("Element not found.");
        }

        input.close();
    }
}