// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/24/19		Hora: 7:15

import java.util.Scanner; //I include the external class Scanner on this line.

class Excercise33{	//Declaration of a class named Excercise33

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
	
	

	System.out.println("Input a number: "); //Prints Input a number. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
	

	int num = input.nextInt();		//Initialization of the variable num which value is the scan of the next 

						//token of the input as an int. Input is the name of the object, the dot 

						//operator is used to call the methods of the class Scanner and we leave empty 

						//parenthesis because there are no arguments to fill with.
	
	int sum = 0;				//Initialization of the variable sum.
	
	while (num !=0){			//Use of a while statement which it's going to continually execute a block of statements while the condition
						// in parenthesis is true. To execute the block of statements the variable num needs to be different than 0.
	sum += num % 10;			//On each iteration the variable sum it's going to sum the result of num's value mod 10 to its own value.
	num /= 10;				//After calculating the statement from above, the variable num it's going to divide by ten and then add that value to the variable num.
						
	}	
	
	System.out.println("The sum of all the digits is: " + sum); //Prints the result.
     }
}
