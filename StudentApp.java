import java.util.Scanner;

/**
 * StudentRecord class to store and display student information
 */
class StudentRecord {
    // Fields to store student details
    private String studentID;
    private String name;
    private String course;
    
    // Constructor to initialize the fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("=== Student Details ===");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

/**
 * StudentApp class to interact with the user and create StudentRecord objects
 */
class StudentApp {
    public static void main(String[] args) {
        // Create Scanner object for user input
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
        
        // Instantiate StudentRecord object with user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);
        
        // Display student details using displayInfo method
        student.displayInfo();
        
        // Close the scanner
        scanner.close();
    }
}
