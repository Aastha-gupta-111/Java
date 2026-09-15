import java.util.ArrayList;
import java.util.Scanner;

public class CaseC3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> salaries = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Store salaries
        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            int salary = sc.nextInt();
            salaries.add(salary);
        }

        // Display all salaries
        System.out.println("\nEmployee Salaries:");
        for (int salary : salaries) {
            System.out.println(salary);
        }

        // Find highest salary
        int highest = salaries.get(0);

        for (int salary : salaries) {
            if (salary > highest) {
                highest = salary;
            }
        }

        // Calculate total salary
        int total = 0;

        for (int salary : salaries) {
            total += salary;
        }

        // Calculate average salary
        double average = (double) total / salaries.size();

        System.out.println("\nHighest Salary = " + highest);
        System.out.println("Total Salary = " + total);
        System.out.println("Average Salary = " + average);

        sc.close();
    }
}