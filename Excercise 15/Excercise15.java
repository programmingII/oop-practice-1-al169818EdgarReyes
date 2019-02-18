//Nombre: Edgar Omar Reyes Olivas 		Dia: 02/12/2019			Hora: 12:35

class Excercise15{ //Declaration of a class named Excercise15

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it.
	
	int a = 10; //Initialization of a variable of type int named a which value is 10.
	int b = 20; //Initialization of a variable of type int named b which value is 20.
	int aux; //Declaration of a variable of type int named aux.
	
	System.out.println("Value of a: " + a + "\nValue of b: " + b); //Prints Input a number. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.

	aux = a; //Assigment of the value of the variable a to the variable aux.
	a = b; //Assigment of the value of the variable b to the variable a.
	b = aux; //Asigment of the value of the variable aux to the variable b.

	System.out.println("Value of a: " + a + "\nValue of b: " + b);	//Prints Value of a and value of b followed by their. 
						// respectives values. System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.

	}
}
