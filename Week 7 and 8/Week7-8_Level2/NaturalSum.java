import java.util.Scanner;

public class NaturalSum {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int rec = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive Sum: " + rec);
        System.out.println("Formula Sum: " + formula);

        if (rec == formula) {
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Results are DIFFERENT");
        }
    }
}