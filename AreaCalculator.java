package AreaCalculator;

import java.util.Scanner;
public class AreaCalculator
{
	// set PI constant
    private static final double PI = 3.14;

    // displays the option menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Area Calculator***");
        System.out.println("S  --  Square");
        System.out.println("R  --  Rectangle");
        System.out.println("C  --  Circle");

        String option = scanner.nextLine().toUpperCase();

        // Get the option selected by the user
        switch (option) {
            case "S":
                System.out.println("Please enter length of the square:");
                int squareLength = scanner.nextInt();
                int squareArea = calculateSquareArea(squareLength);
                System.out.println("Area of your square is: " + squareArea);
                break;

            case "R":
                System.out.println("Please enter length of the rectangle:");
                int rectangleLength = scanner.nextInt();
                System.out.println("Please enter width of the rectangle:");
                int rectangleWidth = scanner.nextInt();
                int rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
                System.out.println("Area of your rectangle is: " + rectangleArea);
                break;

            case "C":
                System.out.println("Please enter the radius of the circle:");
                int circleRadius = scanner.nextInt();
                double circleArea = calculateCircleArea(circleRadius);
                System.out.printf("Area of your circle is: %.2f",circleArea);
                break;

            default:
                System.out.println("Invalid input, restart and try again");
                break;               
        }
        	scanner.close();
    }

    // square area calculation
    private static int calculateSquareArea(int length) {
        return length * length;
    }

    // rectangle area calculation
    private static int calculateRectangleArea(int length, int width) {
        return length * width;
    }

    // circle area calculation
    private static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }
}