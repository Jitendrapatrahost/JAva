import java.util.*;

class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 Bank Withdrawal");
        System.out.println("2 Student Marks Check");
        System.out.println("3 Voter Eligibility");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            String bal = sc.nextLine();
            String wd = sc.nextLine();
            try {
                int b = Integer.parseInt(bal);
                int w = Integer.parseInt(wd);
                if (w > b)
                    throw new ArithmeticException("Insufficient Balance");
                if (w <= 0)
                    throw new Exception("Invalid Withdrawal Amount");
                b = b - w;
                System.out.println("Withdrawal Successful");
                System.out.println("Updated Balance: " + b);
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

        else if (choice == 2) {
            String m1 = sc.nextLine();
            String m2 = sc.nextLine();
            String m3 = sc.nextLine();
            try {
                if (m1.equals("") || m2.equals("") || m3.equals(""))
                    throw new NullPointerException();
                int a = Integer.parseInt(m1);
                int b = Integer.parseInt(m2);
                int c = Integer.parseInt(m3);
                if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100)
                    throw new ArithmeticException("Marks out of range");
                int total = a + b + c;
                double avg = total / 3.0;
                System.out.println("Total: " + total);
                System.out.println("Average: " + avg);
                if (avg >= 33)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid Number");
            }
            catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            catch(NullPointerException e) {
                System.out.println("Marks Missing");
            }
        }

        else if (choice == 3) {
            String age = sc.nextLine();
            try {
                int a = Integer.parseInt(age);
                if (a == 0)
                    throw new ArithmeticException("Age Cannot Be Zero");
                if (a < 0 || a > 120)
                    throw new Exception("Age Out of Valid Range");
                if (a >= 18)
                    System.out.println("Eligible");
                else
                    System.out.println("Not Eligible");
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

        else {
            System.out.println("Invalid Choice");
        }
    }
}
