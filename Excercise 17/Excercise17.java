// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/17/19		Hora: 6:30

import java.util.Scanner; //On this line I include the external class Scanner.

class Excercise17{	//Declaration of a class named Excerise7
	public static void main(String[] args){

		Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		
		System.out.println("Input first binary number: "); //Prints Input first binary number. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.
		
		String bin1 = input.nextLine(); //Initialization of the String variable bin1 which value is the scan of the next 
						//token of the input as an int. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.

		System.out.println("Input second binary number: "); /Prints Input first binary number. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.

		String bin2 = input.nextLine(); //Initialization of the String variable bin2 which value is the scan of the next 
						//token of the input as an int. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.

		
		int add = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2); //Initialization of the int type variable add which value is the addition of 
										//the variables bin1 and bin2. The binary number were parsed to an integer
										//in the radix specified by the second argument on the parseInt method 
										//from the class Integer.

		String res = Integer.toBinaryString(add);			//Initialization of the String type variable res which value is the variable
										//add represented as a string, this was made using the toBinaryString method
										// of the Integer class.
		
		System.out.println("Result of " + bin1 + " + " + bin2 + " = " + res);	//Prints the result of the addition of two binary numbers.
	}

}