package CarDealershipMenu;

import java.util.Scanner;

import Dealership.Car;

// Defines the Car class along with the five private fields
class Car {
    private String make;
    private String model;
    private int year;
    private int doors;
    private int price;

    // Sets the values for the five fields from user
    public Car(String make, String model, int year, int doors, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.doors = doors;
        this.price = price;
    }

    // Display method for displaying the five Car fields
    public void displayCar() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Doors: " + doors);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

// Define Dealership class using the main() method
class Dealership {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
        	// Display menu
            System.out.println("***Auto Dealership***\n");
            System.out.println("1  --  Add Vehicle");
            System.out.println("2  --  Display All Vehicles");
            System.out.println("0  --  Quit");

            option = scanner.nextInt();

            // Switch statement for option handling
            switch (option) {
               
            	// Option 1 - Add Vehicle
            	case 1:
                    for (int i = 0; i < cars.length; i++) {
                        System.out.println("Please enter make:");
                        String make = scanner.next();
                        System.out.println("Please enter model:");
                        String model = scanner.next();
                        System.out.println("Please enter year:");
                        int year = scanner.nextInt();
                        System.out.println("Please enter doors:");
                        int doors = scanner.nextInt();
                        System.out.println("Please enter price:");
                        int price = scanner.nextInt();

                        cars[i] = new Car(make, model, year, doors, price);
                    }
                    break;
                
            	// Option 2 - Display All Vehicles
            	case 2:
                    for (Car car : cars) {
                        if (car != null) {
                            car.displayCar();
                        }
                    }
                    break;
                
            	// Option 3 - Quit
            	case 0:
                    System.out.println("Thanks for visiting our dealership!");
                    break;
                
            	// Invalid input handler
            	default:
                    System.out.println("Invalid input, please try again");
                    break;
            }
        } while (option != 0);

        // Close scanner object
        scanner.close();
    }
}