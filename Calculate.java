public class Calculate {
    int a, b;
    Calculate(){
        this.a = 7;
        this.b = 90;
    }
    Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Calculate C1 = new Calculate();
        Calculate C2 = new Calculate(5,4);
        C1.display();
        C2.display();
    }
}

