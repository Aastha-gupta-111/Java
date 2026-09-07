import java.util.Scanner;
class Employee{
    int empId;
    String name;
    double basicSal;
    
    Employee(int empId, String name, double basicSal){
        this.empId = empId;
        this.name = name;
        this.basicSal = basicSal;
    }
    double calHRA(){
        return basicSal*0.20;
    }
    double calDA(){
        return basicSal*0.10;
    }
    double calGrossSal(){
        return basicSal+ calHRA()+calDA();
    }
    void display(){
        System.out.println("Employee Salary Details");
        System.out.println("Employee Id: "+ empId);
        System.out.println("Employee Name: "+ name);
        System.out.println("Basic Salary: "+ basicSal);
        System.out.println("HRA (20%): "+ calHRA());
        System.out.println("DA (10%): "+ calDA());
        System.out.println("Gross Salary: "+ calGrossSal());
    }
}
public class Case3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name: ");
        String name= sc.nextLine();

        System.out.println("Enter basic salary: ");
        double basicSal = sc.nextDouble();

        Employee employee = new Employee(empId, name , basicSal);
        employee.display();
        sc.close();


    }
    
}
