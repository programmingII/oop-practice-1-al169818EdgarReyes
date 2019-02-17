//Nombre: Edgar Omar Reyes Olivas 		Dia: 05/02/19			Hora: 12:50

class Excercise4{ //Declaration of a class named Excercise4
	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it.
		
		System.out.println(-5 + 8 * 6); //Printing the result of (-5 + 8 * 6) = 43 . 
						//System it's a class. Out it's a field on the system class, 
						//it's an standard output stream. Println() it's a method of the PrintStream class 
						//which prints any type of primitive data types and then terminates the line.
		
		System.out.println((55 + 9) % 9); //Printing the result of ((55 + 9) % 9) = 1.
		System.out.println(20 + -3*5 / 8); //Printing the result of ( 20 + -3*5 / 8) = 19.
		System.out.println(5 + 15 / 3 * 2 - 8 % 3); //Printing the result of (5 + 15 / 3 * 2 - 8  % 3) = 13
		
	}
}
