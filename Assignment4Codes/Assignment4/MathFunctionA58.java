package Assignment4;
public class MathFunctionA58 {
public static void main(String[] args) {
        // Variable declarations
        double num1 = -15.6;
        int a = 25, b = 50;

        System.out.printf("--- Java Math Class Functions ---\n");

        // 1. Math.abs()
        System.out.printf("Absolute value of %.1f: %.1f\n", num1, Math.abs(num1));

        // 2. Math.max()
        System.out.printf("Maximum of %d and %d: %d\n", a, b, Math.max(a, b));

        // 3. Math.min()
        System.out.printf("Minimum of %d and %d: %d\n", a, b, Math.min(a, b));

        // 4. Math.sqrt()
        System.out.printf("Square root of 64: %.1f\n", Math.sqrt(64));

        // 5. Math.pow()
        System.out.printf("2 raised to power 3: %.1f\n", Math.pow(2, 3));

        // 6. Math.ceil()
        System.out.printf("Ceil of 12.1: %.1f\n", Math.ceil(12.1));

        // 7. Math.floor()
        System.out.printf("Floor of 12.9: %.1f\n", Math.floor(12.9));

        // 8. Math.round()
        System.out.printf("Round 15.5: %d\n", Math.round(15.5));

        // 9. Math.log10()
        System.out.printf("Log10 of 100: %.1f\n", Math.log10(100));

        // 10. Math.random()
        System.out.printf("Random number: %.0f\n", Math.random()*100+1);
    }
}