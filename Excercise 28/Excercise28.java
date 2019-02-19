// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/18/19		Hora: 9:00

import java.util.Scanner; //On this line I include the external class Scanner.

class Excercise28{	//Declaration of a class named Excerise7
	public static void main(String[] args){

		Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		
		System.out.println("Input hexadecimal number: "); //Prints input an octal number. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.
		
		int hex = input.nextInt(16); //Initialization of the Integer variable hex which value is the scan of the next 
						//token of the input as an int. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.

		
		

		String res = Integer.toString(hex);			//Initialization of the String type variable res which value is the variable
										//oct represented as an hexadecimal string, this was made using the toHexString method
										// of the Integer class.
		
		System.out.println("Decimal number: " + res);	//Prints the convertion.
	}

}