import java.util.*;

class MarksCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks for Subject 1:");
        String m1 = sc.nextLine();

        System.out.println("Enter Marks for Subject 2:");
        String m2 = sc.nextLine();

        System.out.println("Enter Marks for Subject 3:");
        String m3 = sc.nextLine();

        try {
            if (m1.equals("") || m2.equals("") || m3.equals(""))
                throw new NullPointerException();

            int a = Integer.parseInt(m1);
            int b = Integer.parseInt(m2);
            int c = Integer.parseInt(m3);

            if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100)
                throw new ArithmeticException();

            int total = a + b + c;
            double avg = total / 3.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + avg);

            if (avg >= 33)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");
        }
        catch(NumberFormatException e) {
            System.out.println("Error caught: " + e);
        }
        catch(ArithmeticException e) {
            System.out.println("Error caught: " + e);
        }
        catch(NullPointerException e) {
            System.out.println("Error caught: " + e);
        }
    }
}
