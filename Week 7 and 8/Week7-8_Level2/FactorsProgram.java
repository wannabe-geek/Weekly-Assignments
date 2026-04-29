import java.util.Scanner;

public class FactorsProgram {

    // Method to get factors
    public static int[] getFactors(int n) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    // Product of factors
    public static int product(int[] arr) {
        int p = 1;
        for (int i : arr) p *= i;
        return p;
    }

    // Sum of squares
    public static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int i : arr) {
            s += Math.pow(i, 2);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        System.out.println("Factors:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}