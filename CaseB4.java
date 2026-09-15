import java.util.Scanner;

public class CaseB4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();

            if (price <= 0) {
                throw new IllegalArgumentException("Product price must be greater than 0.");
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than 0.");
            }

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException(
                    "Discount must be between 0 and 100."
                );
            }

            double bill = price * quantity;
            double discountAmount = bill * discount / 100;
            double finalAmount = bill - discountAmount;

            System.out.println("Bill amount = " + bill);
            System.out.println("Discount amount = " + discountAmount);
            System.out.println("Final amount = " + finalAmount);

            System.out.print("Enter payment amount: ");
            double payment = sc.nextDouble();

            if (payment < finalAmount) {
                throw new ArithmeticException(
                    "Payment amount is less than the bill."
                );
            }

            double balance = payment - finalAmount;

            System.out.println("Payment successful.");
            System.out.println("Balance returned = " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Payment Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }

        sc.close();
    }
}
