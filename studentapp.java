/*CT100/G/25066/24
CHEPKEMOI SHARON */
import java.util.Scanner;

class studentrecord {
    // Attributes
    String studentID;
    String name;
    String course;

    // Constructor
    public studentrecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class studentapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student ID
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        // Prompt user for name
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // Prompt user for course
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Instantiate studentrecord using the input
        studentrecord record = new studentrecord(studentID, name, course);

        // Call displayInfo() to output the data
        record.displayInfo();

        scanner.close();
    }
}
