import java.util.Scanner;

/**
 * Base class Vehicle to store vehicle information
 */
class Vehicle {
    // Fields to store vehicle details
    private String brand;
    private String model;
    private int year;
    
    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("=== Vehicle Details ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

/**
 * Car subclass that inherits from Vehicle
 */
class Car extends Vehicle {
    // Additional field for Car
    private String fuelType;
    
    // Constructor to initialize all fields including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }
    
    // Override displayDetails to also print fuelType
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

/**
 * Showroom class to interact with the user and create Car objects
 */
class Showroom {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for vehicle brand
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        
        // Prompt user for model
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        
        // Prompt user for year
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Prompt user for fuel type
        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();
        
        // Instantiate Car object with user-provided data
        Car car = new Car(brand, model, year, fuelType);
        
        // Display car details using displayDetails method
        car.displayDetails();
        
        // Close the scanner
        scanner.close();
    }
}
