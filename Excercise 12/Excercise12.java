//Nombre:Edgar Omar Reyes Olivas 		Dia: 07/02/2019			Hora: 1:11

import java.util.Scanner; //On this line I include the external class Scanner.

class Excercise12{ //Declaration of a class named Excercise12
	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it.

		Scanner input = new Scanner(System.in);	// Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		

		System.out.println("Input first number: "); //Prints Input first number. System it's a class. Out it's a field on the system class, 
							//it's an standard output stream. Println() it's a method of the PrintStream class 
							//which prints any type of primitive data types and then terminates the line.
		
		double n1 = input.nextDouble(); //Initialization of the variable n1 which value is the scan of the next 
						//token of the input as a double. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.
		
		System.out.println("Input second number: "); //Prints Input second number.
		double n2 = input.nextDouble(); //Initialization of the variable n2 which value is the scan of the next 
						//token of the input as a double.

		System.out.println("Input third number: "); //Prints Input third number.
							
		double n3 = input.nextDouble(); //Initialization of the variable n3 which value is the scan of the next 
						//token of the input as a double.

		double average = ((n1 +n2 + n3) / 3); //Initialization of the variable average which value it's the average of the three
							//numbers given.
		
		System.out.println("The average is: " + average); //Prints the average is followed by the value of the variable average.
	
	}


}
