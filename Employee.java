public class Employee {
    String name;
    int age;
    Employee(){
        this.name = "hello";
        this.age = 0;
    }
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name:"+ name +" "+ "Age:"+age);
    }

public static void main(String[] args){
    Employee s1 = new Employee();
    Employee s2 = new Employee("Aastha",56);
    s1.display();
    s2.display();

}
}
