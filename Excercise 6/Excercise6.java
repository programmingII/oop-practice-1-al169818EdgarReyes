//Edgar Omar Reyes Olivas 13:17

import java.util.Scanner;

class Excercise6{
	public static void main(String[] args){
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int x = input.nextInt();
		System.out.println("Input second number");
		int y = input.nextInt();

		System.out.println("Addition : " + (x + y));
		System.out.println("Multiplication: " + (x * y));
		System.out.println("Substraction: " + (x - y));
		System.out.println("Division: " + (x / y));
		System.out.println("Remainder: " + (x % y));

	}

}