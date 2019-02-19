// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/17/19		Hora: 7:13

import java.util.Scanner; //On this line I include the external class Scanner.

class Excercise21{	//Declaration of a class named Excercise21
	public static void main(String[] args){

		Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		
		System.out.println("Input decimal number: "); //Prints Input decimal number. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.
		
		int dec = input.nextInt(); //Initialization of the int variable dec which value is the scan of the next 
						//token of the input as an int. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.

		

		String res = Integer.toOctalString(dec);			//Initialization of the String type variable res which value is the variable
										//dec represented as an octal string, this was made using the toOctalString method
										// of the Integer class.
		
		System.out.println("Octal number: " + res);	//Prints the result of the convertion.
	}
}
