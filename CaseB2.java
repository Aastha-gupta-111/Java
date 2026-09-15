import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
}

public class CaseB2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        try{
            System.out.println("Enter withdrawl amount: ");
            if(!sc.hasNextDouble()){
                throw new Exception("Invalid input! Please enter a number.\n");
            }
            double amount = sc.nextDouble();
            if(amount <= 0){
                throw new InvalidAmountException("Invalid withdrawl amount! Amount must be greater than 0.\n");
            }
            if(amount>balance){
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance = balance-amount;

            System.out.println("Withdrawl successfully.\n");
            System.out.println("Withdrawl amount: "+ amount);
            System.out.println("Remaining balance: "+ balance);
    }
        catch(InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

