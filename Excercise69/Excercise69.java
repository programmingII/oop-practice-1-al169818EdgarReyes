// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/27/19		Hora: 10:06

class Excercise69{	//Declaration of a class named Excercise69

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/
		
	String str = "Software";
	String subString = str.substring(0, str.length()/2);
	
	System.out.println(subString);
	
	
	
		}
}
