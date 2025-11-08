import java.util.Scanner;

interface University {
    void setUniversityDetails(String name, String code, String location);
    void getUniversityDetails();
}

interface College extends University {
    void setCollegeDetails(String name, String code, String department);
    void getCollegeDetails();
}

interface StudentOps {
    void setStudentDetails(String name, int roll, String course);
    void printCard();
}

class Student implements College, StudentOps {
    private String universityName;
    private String universityCode;
    private String universityLocation;
    private String collegeName;
    private String collegeCode;
    private String collegeDepartment;
    private String studentName;
    private int studentRoll;
    private String studentCourse;

    public void setUniversityDetails(String name, String code, String location) {
        universityName = name;
        universityCode = code;
        universityLocation = location;
    }

    public void getUniversityDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("University Code: " + universityCode);
        System.out.println("University Location: " + universityLocation);
    }

    public void setCollegeDetails(String name, String code, String department) {
        collegeName = name;
        collegeCode = code;
        collegeDepartment = department;
    }

    public void getCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
        System.out.println("Department: " + collegeDepartment);
    }

    public void setStudentDetails(String name, int roll, String course) {
        studentName = name;
        studentRoll = roll;
        studentCourse = course;
    }

    public void printCard() {
        System.out.println("\n===== STUDENT RECORD =====");
        getUniversityDetails();
        getCollegeDetails();
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + studentRoll);
        System.out.println("Course: " + studentCourse);
        System.out.println("==========================\n");
    }
}

public class ProblemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("University Name: ");
            String uName = sc.nextLine();
            System.out.print("University Code: ");
            String uCode = sc.nextLine();
            System.out.print("University Location: ");
            String uLocation = sc.nextLine();
            students[i].setUniversityDetails(uName, uCode, uLocation);
            System.out.print("College Name: ");
            String cName = sc.nextLine();
            System.out.print("College Code: ");
            String cCode = sc.nextLine();
            System.out.print("Department: ");
            String cDept = sc.nextLine();
            students[i].setCollegeDetails(cName, cCode, cDept);
            System.out.print("Student Name: ");
            String sName = sc.nextLine();
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Course: ");
            String sCourse = sc.nextLine();
            students[i].setStudentDetails(sName, roll, sCourse);
        }
        System.out.println("\n===== ALL STUDENT RECORDS =====");
        for (int i = 0; i < n; i++) {
            students[i].printCard();
        }
        sc.close();
    }
}
