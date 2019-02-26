// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/17/19		Hora: 11:02

class Excercise50{	//Declaration of a class named Excercise50

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/


		

		System.out.println("Input a number: "); //Prints input an octal number. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
						
		
		System.out.println("Divided by 3 & 5: \n");
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0 && i % 5 == 0)
				System.out.print(i + ", ");
			
		}
		
		System.out.println("\n Divided by 5: \n");
		for(int i = 1; i <= 100; i++){
			if(i % 5 == 0)
				System.out.print(i + ", ");
			
		}
		
		System.out.println("\n Divided by 3: \n");
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0)
				System.out.print(i + ", ");
			
		}
			

	}

}