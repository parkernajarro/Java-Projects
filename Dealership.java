package Dealership;

import java.util.Scanner;

//Defines the Vehicle class along with the three private fields
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayVehicle() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

//Defines Car class and extend the Vehicle class
class Car extends Vehicle {
    private int doors;
    private int price;

    public Car(String make, String model, int year, int doors, int price) {
        super(make, model, year);
        this.doors = doors;
        this.price = price;
    }

    public void displayCar() {
        super.displayVehicle();
        System.out.println("Doors: " + doors);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

//Define Dealership class using the main() method
class Dealership {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("***Auto Dealership***\n");
            System.out.println("1 -- Add Vehicle");
            System.out.println("2 -- Display All Vehicles");
            System.out.println("0 -- Quit");

            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                
            	// Option 1
            	case 1:
                    for (int i = 0; i < cars.length; i++) {
                        try {
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
                        } catch (Exception e) {
                            System.out.println("Invalid input, please try again");
                            scanner.nextLine();
                            i--; // Repeat the iteration for invalid input
                        }
                    }
                    break;

               // Option 2
                case 2:
                    for (Car car : cars) {
                        if (car != null) {
                            car.displayCar();
                        }
                    }
                    break;

                
                // Option 3
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