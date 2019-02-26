// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/25/19		Hora: 8:16

import java.nio.charset.Charset; //Import of the external class Charset

//java.nio is a collection of Java programming language APIs that offer features for intensive I/O operations.


class Excercise40{	//Declaration of a class named Excercise39

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	
		System.out.println("List of available character sets: "); //Prints text. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.

	
		for(String charsetName : Charset.availableCharsets().keySet()){ //For loop for printing each name of the charsets available.
										//The ":" operator was designed to be used on iterations through collections	
										//and arrays. On every iteration, the value of the variable charsetName 
										//it's going to be name of the character Set.

										//A character set is a set of textual and graphic symbols, each of which is mapped 
										//to a set of nonnegative integers.
										
										//Charset is the class. availableCharsets() is the method which is going to construct 
										//a sorted map from canonical charset names to charset objects. keySet() is the
										//method that is going to return a Set view of the keys contained in this map.
						
										//A set is a collection that contains no duplicate elements.

			System.out.println(charsetName);			//Prints the value of the variable charsetName.
		}			

	}
}
