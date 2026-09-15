import java.util.Scanner;

public class CaseB3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n == 0) {
                throw new ArithmeticException("No subjects entered. Cannot calculate average.");
            }

            if (n < 0) {
                throw new IllegalArgumentException("Number of subjects cannot be negative.");
            }

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException(
                        "Marks must be between 0 and 100."
                    );
                }

                sum += marks;
            }

            double average = (double) sum / n;

            System.out.println("Average marks = " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}