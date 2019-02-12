//Nombre:Edgar Omar Reyes Olivas 		Dia: 07/02/2019			Hora: 1:11

import java.util.Scanner;

class Excercise12{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);	
		

		System.out.println("Input first number: ");
		double n1 = input.nextDouble();
		
		System.out.println("Input second number: ");
		double n2 = input.nextDouble();

		System.out.println("Input third number: ");
		double n3 = input.nextDouble();

		double average = ((n1 +n2 + n3) / 3);
		
		System.out.println("The average is: " + average);
	
	}


}