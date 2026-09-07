import java.util.Scanner;
class Patient{
    int patientId;
    String name;
    int age;
    double temp;
    Patient(int patientId, String name, int age, double temp){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temp = temp;
    }
    void checkfever(){
        if(temp > 100.4){
            System.out.println("Fever");
        }else{
            System.out.println("Normal");
        }
    }

    void display(){
        System.out.println("Patient details: ");
        System.out.println("Patient Id: "+ patientId);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Temperature:"+ temp+"degree farenhiet");
        System.out.println("Status: ");
        checkfever();
    }
}   
public class Case6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID: ");
        int patientID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter patient name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Temperature: ");
        double temp = sc.nextDouble();

        Patient patient = new Patient(patientID, name, age, temp);

        patient.display();
        sc.close();
    }
    
}
