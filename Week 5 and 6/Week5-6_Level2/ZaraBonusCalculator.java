import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] oldSalaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years for employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }

            oldSalaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = oldSalaries[i] * 0.05;
            } else {
                bonuses[i] = oldSalaries[i] * 0.02;
            }

            newSalaries[i] = oldSalaries[i] + bonuses[i];
            
            totalOldSalary += oldSalaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}