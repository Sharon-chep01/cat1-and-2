/*CT100/G/25066/24
CHEPKEMOI SHARON */
import java.util.Scanner;

class vehicle {
    // Attributes
    String brand;
    String model;
    int year;

    // Constructor
    public vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class car extends vehicle {
    // Additional attribute
    String fuelType;

    // Constructor using super() to initialize vehicle fields and fuelType
    public car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Override displayDetails() to include fuelType
    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for brand
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        // Prompt user for model
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        // Prompt user for year
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Prompt user for fuel type
        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate a car object using user-provided data
        car carObject = new car(brand, model, year, fuelType);

        // Call displayDetails() on the car object
        carObject.displayDetails();

        scanner.close();
    }
}
