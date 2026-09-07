import java.util.Scanner;
class Product{
    int proId;
    String proName;
    double price;
    int quantity;
    Product(int proId, String proName, double price, int quantity){
        this.proId = proId;
        this.proName = proName;
        this.price = price;
        this.quantity = quantity;
    }
    double calCost(){
        return price * quantity;
    }
    void display(){
        System.out.println("Product ID: "+ proId);
        System.out.println("Product Name: "+ proName);
        System.out.println("Price: "+ price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Cost: "+calCost());
    }
}
public class Case4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];
        double totalBill = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Enter details for Product"+(i+1));

            System.out.println("Product Id: ");
            int id = sc.nextInt();
            sc.nextLine();


            System.out.println("Product Name: ");
            String name = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextInt();

            System.out.println("Quantity:" );
            int quantity = sc.nextInt();

            products[i] = new Product(id, name, price, quantity);
            totalBill += products[i].calCost();
        }
        System.out.println("Product details: ");
        for(int i = 0; i < n; i++){
            products[i].display();
        }
        double discount = 0;
        if(totalBill> 5000){
            discount  = totalBill*0.10;
        }
        double finalBill = totalBill-discount;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount : "+ discount);
        System.out.println("Final Bill: " + finalBill);
    }
    
}
