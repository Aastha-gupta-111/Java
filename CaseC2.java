import java.util.ArrayList;
import java.util.Scanner;

public class CaseC2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Shopping Cart ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Check Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String product = sc.nextLine();

                    cart.add(product);
                    System.out.println("Product added to cart.");
                    break;

                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeProduct = sc.nextLine();

                    if (cart.remove(removeProduct)) {
                        System.out.println("Product removed from cart.");
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to check: ");
                    String checkProduct = sc.nextLine();

                    if (cart.contains(checkProduct)) {
                        System.out.println("Product is in the cart.");
                    } else {
                        System.out.println("Product is not in the cart.");
                    }
                    break;

                case 4:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("Products in cart:");

                        for (String item : cart) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}