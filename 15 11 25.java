import java.util.*;

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Account Balance:");
        String balInput = sc.nextLine();

        System.out.println("Enter Withdrawal Amount:");
        String wInput = sc.nextLine();

        try {
            int balance = Integer.parseInt(balInput);
            int withdraw = Integer.parseInt(wInput);

            if (withdraw > balance)
                throw new ArithmeticException("Error: Insufficient Balance");

            if (withdraw <= 0)
                throw new Exception("Error: Withdrawal amount must be greater than zero");

            balance = balance - withdraw;

            System.out.println("Withdrawal Successful");
            System.out.println("Amount Withdrawn: " + withdraw);
            System.out.println("Remaining Balance: " + balance);
        }
        catch(NumberFormatException e) {
            System.out.println("Error: Please enter only numbers.");
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
