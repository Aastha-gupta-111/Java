import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String messsage){
        super(messsage);
    }
}
class InvalidSeatsException extends Exception{
    InvalidSeatsException(String message){
    super(message);
}
}
class InsufficientSeatsException extends Exception{
    InsufficientSeatsException(String message){
        super(message);
    }
}
public class CaseB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableSeats = 40;
        try{
            System.out.println("Enter passenger age: ");
            int age = sc.nextInt();
            if(age <= 0){
                throw new InvalidAgeException(
                    "Invalid age! Age must be greater than 0.\n");
                }
                System.out.println("Enter number of seats: ");
                int seats = sc.nextInt();
                if(seats <=0){
                    throw new InvalidSeatsException("Invalid number of seats! Seats must me greater than zero.\n");
                }
                if(seats > availableSeats){
                    throw new InsufficientSeatsException("Insufficient seats! Only"+ availableSeats+"seats are available.\n");
                }
                availableSeats = availableSeats-seats;
                System.out.println("Booking successfull!");
                System.out.println("Passenger age: "+age);
                System.out.println("Seats booked: "+ seats);
                System.out.println("Remaining seats:  "+ availableSeats);
            }
            catch(InvalidAgeException e){
                System.out.println(e.getMessage());
            }
            catch(InvalidSeatsException e){
                System.out.println(e.getMessage());
            }
            catch(InsufficientSeatsException e){
                System.out.println(e.getMessage());
            }
            catch(java.util.InputMismatchException e){
                System.out.println("Invalid input! Please enter number only.\n");
            }
            finally{
                sc.close();
            }
        }

    }


