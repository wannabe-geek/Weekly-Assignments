import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.println("positive even");
                } else {
                    System.out.println("positive odd");
                }
            } else if (nums[i] < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }

        if (nums[0] == nums[4]) {
            System.out.println("equal");
        } else if (nums[0] > nums[4]) {
            System.out.println("greater");
        } else {
            System.out.println("less");
        }
    }
}