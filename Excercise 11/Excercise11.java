//Nombre:Edgar Omar Reyes Olivas 		Dia:07/02/2019		Hora: 12:53

class Excercise11{//Declaration of a class names Excercise11
	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it.
		
		double radius = 7.5;		//Inicialization of the variable radius which value is 7.5.
		double perimeter = 2 * 3.1416 * radius; //Inicialization of the variable perimeter which value is 47.124.
		double area = 3.1416 * (radius * radius); //Inicialization of hte variable area whic value is 176.715.
		
		System.out.println("Perimeter is= " + perimeter);  //Prints Perimeter and the value of the variable perimeter. 
								  //System it's a class. Out it's a field on the system class, 
								 //it's an standard output stream. Println() it's a method of the PrintStream class 
								//which prints any type of primitive data types and then terminates the line.
		
		
		System.out.println("Area is = " + area);  //Prints Area and the value of the variable Area. 
							 //System it's a class. Out it's a field on the system class, 
						        //it's an standard output stream. Println() it's a method of the PrintStream class 
						       //which prints any type of primitive data types and then terminates the line.	
	}
	
}
