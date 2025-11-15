import java.util.*;

class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String balInput = sc.nextLine();
        String wInput = sc.nextLine();

        try {
            int balance = Integer.parseInt(balInput);
            int withdraw = Integer.parseInt(wInput);

            if (withdraw > balance)
                throw new ArithmeticException("Insufficient Balance");

            if (withdraw <= 0)
                throw new Exception("Invalid Withdrawal Amount");

            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Updated Balance: " + balance);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid Number");
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
