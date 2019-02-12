//Edgar Omar Reyes Olivas 	02/07/2019	12:27

import java.util.Scanner;

class Excercise7{
	public static void main(String args[]){
	
	Scanner input = new Scanner(System.in);

	System.out.println("Input a number: ");
	int n = input.nextInt();
	
	for(int i = 1; i <= 10; i++){
		System.out.println(n + " * " + i  + " = " + (n*i));
	}

	}
}
