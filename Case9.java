import java.util.Scanner;
class Student{
    String name;
    String[] courses = new String[5];
    int coursecount = 0;
    Student(String name){
        this.name = name;
    }
    void registerCourse(String courseName){
        if(coursecount < 5){
            courses[coursecount] = courseName;
            coursecount++;
            System.out.println(("Course registered succesfully"));
        }else{
            System.out.println("Cannot register. Maximum limit of 5 courses reached.\n");
        }
    }
    void display(){
        System.out.println("Registered course");
        System.out.println("Student Name: "+name);
        if(coursecount == 0){
            System.out.println("No courses registered.\n");
        }else{
            for(int i = 0; i < coursecount; i++){
                System.out.println((i+1)+", "+ courses[i]);
            }
        }
    }
}
public class Case9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        System.out.print("Enter number of courses to register: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            String courseName = sc.nextLine();

            student.registerCourse(courseName);
        }

        student.display();

        sc.close();
    }
}

