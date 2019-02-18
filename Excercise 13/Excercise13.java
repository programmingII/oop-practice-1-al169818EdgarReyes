//Nombre:Edgar Omar Reyes Olivas		Dia: 07/02/2019			Hora: 1:29

class Excercise13{//Declaration of a class named Excercise13
	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it.
		
		double width = 5.5; // Initialization of the variable width which value is 5.5 and it's a double type variable.
		double height = 8.5; // Initialization of the variable height which value is 8.5 and it's a double type variable..
		double area = width * height; // Initialization of the variable area which value is the product of width and height
						//and it's a double type variable.
		
		double perimeter = 2 * (width + height); // Initialization of te variable perimeter which value is the addition of 
							// the variables width and height * 2.
		System.out.println("Area is " + width + " * " + height + " = " + area); 
						//Prints Area is followed by the value of the variable area. 
						//System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.
		
		System.out.println("Perimeter is 2 * (  " + width + " + " + height + ") = " + perimeter); 
						//Prints Perimieter is followed by the value of the variable perimeter. 
						//System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.

	}

}
