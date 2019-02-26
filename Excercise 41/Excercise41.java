// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/25/19		Hora: 4:32


import java.util.Scanner;

class Excercise41{	//Declaration of a class named Excercise41

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

		Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		
		System.out.println("Input a character: "); //Asks for a character. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.

		
		char c = input.next().charAt(0); //Initialization of the variable c. The value of c is given by is the scan of the next 
						//token of the input as a String "next()", but the method charAt() gives the character 
						//of the position in the arguments. next() is from the class Scanner and charAt() from
						//the class String.

		System.out.println( "The ASCII value of " + c + " is: " + (int) c); //Prints text and then a cast conversion is made, it converts
										    //the char variable to an int variable.
	
	}
}
