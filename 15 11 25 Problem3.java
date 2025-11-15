import java.util.*;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age:");
        String ageInput = sc.nextLine();

        try {
            int age = Integer.parseInt(ageInput);

            if (age == 0)
                throw new ArithmeticException();

            if (age < 0 || age > 120)
                throw new Exception();

            if (age >= 18)
                System.out.println("You are Eligible to Vote.");
            else
                System.out.println("You are Not Eligible to Vote.");
        }
        catch(NumberFormatException e) {
            System.out.println("Error caught: " + e);
        }
        catch(ArithmeticException e) {
            System.out.println("Error caught: " + e);
        }
        catch(Exception e) {
            System.out.println("Error caught: " + e);
        }
    }
}
