import java.util.ArrayList;
import java.util.Scanner;

public class  CaseC1 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Attendance Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Number of Students Present");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.println("Students Present:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String search = sc.nextLine();

                    if (students.contains(search))
                        System.out.println("Student is present.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.print("Enter student name to remove: ");
                    String remove = sc.nextLine();

                    if (students.remove(remove))
                        System.out.println("Student removed successfully.");
                    else
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.println("Number of students present: " + students.size());
                    break;

                case 6:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
