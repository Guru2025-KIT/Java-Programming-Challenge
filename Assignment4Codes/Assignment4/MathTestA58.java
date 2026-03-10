package Assignment4;
class MyMathA58 {

    // static method to calculate square
    static int square(int num) {
        return num * num;
    }

    // static method to calculate cube
    static int cube(int num) {
        return num * num * num;
    }

    // static method to find maximum of two numbers
    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // static method to find minimum of two numbers
    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    // static method to find absolute value
    static int absolute(int num) {
        if (num < 0)
            return -num;
        else
            return num;
    }
}

public class MathTestA58 {

    public static void main(String[] args) {

        System.out.println("\nMaths Method Using Static:");
        System.out.println("Square of 4 = " + MyMathA58.square(4));
        System.out.println("Cube of 3 = " + MyMathA58.cube(3));
        System.out.println("Maximum of 10 and 20 = " + MyMathA58.max(10, 20));
        System.out.println("Minimum of 10 and 20 = " + MyMathA58.min(10, 20));
        System.out.println("Absolute value of -15 = " + MyMathA58.absolute(-15));

    }
}