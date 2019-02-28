// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/27/19		Hora: 09:37

class Excercise67{	//Declaration of a class named Excercise67

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/



		String str = "Python 3.0";		//Initialization of the variable str.
		String addition = "Tutorial";	//Initialization of the variable addition.
		String newWord = str.substring(0, 7) + addition + str.substring(6); /* Initialization of the variable new Word. Which value will be
																			* the concatenation of the substring that starts at the first
																			* specified value and ends at the second specified value from the
																			* arguments of the substring method of the String Class, the variable	
																			* addition, and the substring of str which starts at the specified value.
																			*/
		System.out.println("Result: " + newWord);							//Prints the result.
	
							   
							   
							   
							   
							   
	}							 
}