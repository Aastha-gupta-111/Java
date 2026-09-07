import java.util.Scanner;
class BankAccount{
    String accNumber;
    String accName;
    double balance;
    BankAccount(String accNumber, String accName, double balance){
        this.accNumber = accNumber;
        this.accName = accName;
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited successfully.\n");
    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient blance. Withdrawl not allowed.\n");
        }else{
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.\n");
        }
    }
    void displayBalance(){
        System.out.println("Account Number: "+ accNumber);
        System.out.println("Account Holder: "+ accName);
        System.out.println("Current balance: "+ balance);
    }
}
public class Case2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String accNumber = sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String accName = sc.nextLine();
        System.out.println("Enter initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accNumber  , accName, balance);


        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter amount to withdraw: ");
        double withdrawlAmount = sc.nextDouble();
        account.withdraw(withdrawlAmount);

        System.out.println("AMOUNT DETAILS");
        account.displayBalance();
        sc.close();
    }
    
}
