// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/24/19		Hora: 8:20

import java.util.Scanner; //I include the external class Scanner on this line.
import java.lang.Math; //I include the external class Math.

class Excercise34{	//Declaration of a class named Excercise34

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
	
	

	System.out.println("Input the length of a side of the hexagon: "); //Asks for the lenght of a side of an hexagon. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
	

	int side = input.nextInt();		//Initialization of the variable side which value is the scan of the next 

						//token of the input as an int. Input is the name of the object, the dot 

						//operator is used to call the methods of the class Scanner and we leave empty 

						//parenthesis because there are no arguments to fill with.

	
	double area = (6 * side*side)/(4*Math.tan(Math.PI/6));		//Initialization of the variable area. Math.tan is a method from the class Math that 
								       //returns the trigonometric tangent of an angle. Math.PI is a field from the Math class.
	
	System.out.println("The area of the hexagon is: " + area);	//Prints the result.
	
	
}
}



