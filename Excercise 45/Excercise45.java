// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/17/19		Hora: 7:13



import java.io.File; //On this line I include the external class File which gives an abstract representation of file and directory pathnames. 



class Excercise45{	//Declaration of a class named Excercise45

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/



		System.out.println("C:/Users/edgar/testfile.txt: " + new File("testfile.txt").length() + " bytes"); /*Prints the result. System it's a class. Out it's a field on the system class, 

																											*it's an standard output stream. Println() it's a method of the PrintStream class 

																											*which prints any type of primitive data types and then terminates the line.
																											
																											* new File. Creation of an object of the File Class converts the given pathname string into 
																												
																											*an abstract pathname.. It's a Constructor. .lenght() is method from File class,
																											
																											*it returns the length of the file denoted by this abstract pathname.

	}

}