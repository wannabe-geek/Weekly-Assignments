import java.util.Scanner;

public class StringLength {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // will throw exception at end
                count++;
            }
        } catch (Exception e) {
            // Exception means end of string reached
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        int manualLength = findLength(text);
        int actualLength = text.length();

        System.out.println("Length (without length()): " + manualLength);
        System.out.println("Length (using length()): " + actualLength);
    }
}