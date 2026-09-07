import java.util.Scanner;
class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    void display(){
        super.display();
        System.out.println("Bonus: "+ bonus);
        System.out.println("Total Salary: "+(salary+ bonus));
    }
}
public class Case8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manager name: ");
        String name = sc.nextLine();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter bonus: ");
        double bonus = sc.nextDouble();

        Manager manager = new Manager(name, salary, bonus );

        System.out.println("Manager Details:" );
        manager.display();
        sc.close();
    }
}