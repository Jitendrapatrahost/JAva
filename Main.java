import java.util.Scanner;

class University {
    String uniName, uniAddress, uniState, uniCountry;
    int yearEstablished;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter University Name: ");
        uniName = sc.nextLine();
        System.out.print("Enter University Address: ");
        uniAddress = sc.nextLine();
        System.out.print("Enter State: ");
        uniState = sc.nextLine();
        System.out.print("Enter Country: ");
        uniCountry = sc.nextLine();
        System.out.print("Enter Year of Establishment: ");
        yearEstablished = sc.nextInt();
        sc.nextLine();
    }

    void display() {
        System.out.println("---- University Information ----");
        System.out.println("Name: " + uniName);
        System.out.println("Address: " + uniAddress);
        System.out.println("State: " + uniState);
        System.out.println("Country: " + uniCountry);
        System.out.println("Year Established: " + yearEstablished);
    }
}

class College {
    String colName, colAddress, department;
    int yearEstablished;
    University u = new University();

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter College Name: ");
        colName = sc.nextLine();
        System.out.print("Enter College Address: ");
        colAddress = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Year of Establishment: ");
        yearEstablished = sc.nextInt();
        sc.nextLine();
        u.input();
    }

    void display() {
        System.out.println("---- College Information ----");
        System.out.println("Name: " + colName);
        System.out.println("Address: " + colAddress);
        System.out.println("Department: " + department);
        System.out.println("Year Established: " + yearEstablished);
        u.display();
    }
}

class Student {
    String rollNo, name, gender, address;
    int yearOfEnrollment;
    College c = new College();

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No: ");
        rollNo = sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Year of Enrollment: ");
        yearOfEnrollment = sc.nextInt();
        sc.nextLine();
        c.input();
    }

    void display() {
        System.out.println("---- Student Information ----");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Year of Enrollment: " + yearOfEnrollment);
        c.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}
