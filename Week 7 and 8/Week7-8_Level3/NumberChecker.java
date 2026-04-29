import java.util.Scanner;

public class NumberChecker {

    // Count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Store digits
    public static int[] getDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    // Duck number (contains at least one zero, but not at start)
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Armstrong number
    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == n;
    }

    // Largest & second largest
    public static void largest(int[] digits) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + max2);
    }

    // Smallest & second smallest
    public static void smallest(int[] digits) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }

        System.out.println("Smallest: " + min1);
        System.out.println("Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digit Count: " + countDigits(num));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");

        System.out.println("\nIs Duck Number: " + isDuck(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(num, digits));

        largest(digits);
        smallest(digits);
    }
}