import java.util.Scanner;
class ATM{
    int pin = 1234;
    double balance = 5000;

    boolean checkPin(int enterPin){
        return enterPin  == pin;
    }
    void withdraw(double amount){
        if(amount > balance){
            System.err.println("Insufficcient balance.");
        }else{
            balance = balance-amount;
            System.out.println("Amount withdraw successfully.\n");
        }
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited successfully.\n");
    }
    void display(){
        System.out.println("Current Balance: "+ balance);
    }
}


public class Case7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int attempts = 0;
        boolean correctPin = false;

        while(attempts<3){
            System.out.println("Enter PIN: ");
            int enteredPin = sc.nextInt();
            if(atm.checkPin(enteredPin)){
                correctPin = true;
                System.out.println("PIN verified successsfully.\n");
                break;
            }else{
                attempts++;
                System.out.println("Incorrect PIN.\n");
                if(attempts<3){
                    System.out.println("Attempts remaining: "+ (3-attempts));
                }
            }
        }
        if(!correctPin){
            System.out.println("Maximum incorrect attempts reached. Account blocked.\n");
            sc.close();
            return;

        }
        int choice;
        do{
            System.out.println("ATM menu");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display");
            System.out.println("Exit");


            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: 
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                atm.withdraw(withdrawAmount);
                break;

                case 2: 
                System.out.println("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                atm.deposit(depositAmount);
                break;

                case 3: 
                atm.display();
                break;

                case 4: 
                System.out.println("Thank you for using the ATM.\n");

                default:
                    System.out.println("Invalid choice.\n");
            }

        }while(choice != 4);
        sc.close();
        
    }
    
}
