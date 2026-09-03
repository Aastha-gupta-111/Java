import java.util.Scanner;

public class Case1 {
    int rollNo;
    String name;
    int[] marks = new int[5];
    double percentage;
    int total;
    String grade;
    String result;

    void getInput(Scanner sc) {
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
        }
    }

    void calculateTotal() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        percentage = total / 5.0;
    }

    void toCalculateGrade() {
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        result = (percentage >= 50) ? "PASS" : "FAIL";
    }

    void display() {
        System.out.println("Grade      : " + grade);
        System.out.println("Result     : " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Case1 s = new Case1();
        s.getInput(sc);
        s.calculateTotal();
        s.toCalculateGrade();
        s.display();

        sc.close();
    }
}
