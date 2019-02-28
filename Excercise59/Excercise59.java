// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/17/19		Hora: 01:07



import java.util.Scanner; //On this line I include the external class Scanner.



class Excercise59{	//Declaration of a class named Excercise59

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/



		
	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 

						//operator we create an object and call the constructor that is Scanner. Finally

						//we initialize the object with the argument System.in which is an input stream.

		

		System.out.println("Input an String: "); //Asks for a string. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
						
						
		String str = input.nextLine(); //Initialization of the variable strwhich value is the scan of the next 

						//token of the input as a String. Input is the name of the object, the dot 

						//operator is used to call the methods of the class and we leave empty 

						//parenthesis becasue there are no arguments to fill with.
						
		String strLower = str.toLowerCase();

		System.out.println(strLower);

		
	}
}

