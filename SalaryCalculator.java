package SalaryCalculator;

import java.util.Scanner;
public class SalaryCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
//Declaring variables		
		double salary;
		double rate;
		double newSalary;
		double newSalary2;

//Ask user for their salary and stores it in the variable named salary		
		System.out.print("Enter your starting salary: ");
		salary = input.nextDouble();

//Asks user for their salary increase rate and stores in the rate variable		
		System.out.print("Enter annual increasing rate: ");
		rate = input.nextDouble();

//Calculates/stores the first new salary based on the original user's inputs then prints the results
		newSalary = salary + (salary * rate);
		System.out.printf("After the first year your salary will be $" + "%.2f", newSalary);

//Uses the first new salary to then calculate the second year salary, then prints the results		
		newSalary2 = newSalary + (newSalary * rate);
		System.out.printf("\nAfter the second year your salary will be $" + "%.2f", newSalary2);
		
		input.close();
	}
}