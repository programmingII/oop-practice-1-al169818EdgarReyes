// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/24/19		Hora: 8:50

import java.util.Scanner; //I include the external class Scanner on this line.
import java.lang.Math; //I include the external class Math.

class Excercise36{	//Declaration of a class named Excercise36

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
	
	
	System.out.println("Input the latitude of coordinate 1: "); //Asks for the latitude of the first coordinate. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
	

	double x1 = input.nextDouble();		//Initialization of the variable x1 which value is the scan of the next 

						//token of the input as a double. Input is the name of the object, the dot 

						//operator is used to call the methods of the class Scanner and we leave empty 

						//parenthesis because there are no arguments to fill with.


	System.out.println("Input the longitude of the coordinate 1: ");

	double y1 = input.nextDouble();

	System.out.println("Input the latitude of coordinate 2: ");
	
	double x2 = input.nextDouble();

	System.out.println("Input the longitude of coordinate 2: ");
	
	double y2 = input.nextDouble();

	double radius = 6371.01;

	
	double distance = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));
					
	//Initialization of the variable distance. Math. Radinas, Math.acos, Math.sin and Math.cos are methods of the external class Math.
	
	System.out.println("Distance between points: " + distance);	//Prints the result.
	
	
}
}



