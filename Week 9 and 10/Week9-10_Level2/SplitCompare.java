import java.util.Scanner;

public class SplitCompare {

    // Find length without length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Split using charAt()
    public static String[] splitText(String text) {
        int len = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                current += text.charAt(i);
            } else {
                words[index++] = current;
                current = "";
            }
        }
        words[index] = current;

        return words;
    }

    // Compare two arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitText(text);
        String[] builtIn = text.split(" ");

        System.out.println("\nManual Split:");
        for (String word : manual) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtIn) {
            System.out.println(word);
        }

        boolean result = compareArrays(manual, builtIn);
        System.out.println("\nAre both results same? " + result);
    }
}