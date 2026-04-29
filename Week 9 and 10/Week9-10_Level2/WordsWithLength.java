import java.util.Scanner;

public class WordsWithLength {

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

    // Split manually
    public static String[] splitText(String text) {
        int len = findLength(text);

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

    // Create 2D array (word + length)
    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = wordLengths(words);

        System.out.println("\nWord\tLength");
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + len);
        }
    }
}