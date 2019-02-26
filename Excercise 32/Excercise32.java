// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/24/19		Hora: 7:15

import java.util.Scanner; //I include the external class Scanner on this line.

class Excercise32{	//Declaration of a class named Excercise31

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
	
	

	System.out.println("Input first number: "); //Prints Input first number. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.
	

	int num1 = input.nextInt();		//Initialization of the variable num1 which value is the scan of the next 

						//token of the input as an int. Input is the name of the object, the dot 

						//operator is used to call the methods of the class Scanner and we leave empty 

						//parenthesis because there are no arguments to fill with.
	

	System.out.println("Input second number: ");

	int num2 = input.nextInt();


	if(num1 > num2){					//With an if statement we do the evaluation that if the value of the variable num1
		System.out.println(num2 + "!=" + num1);		//is bigger than the value of the variable num2 then we would proceed 
		System.out.println(num2 + "<" + num1);		//to print the results.

	}else if(num1 < num2){					//If the evaluation previously stated is not true then we proceed to make another
		System.out.println(num1 + "!=" + num2);		//evaluation. If the value of the variable num1 is smaller than the value of
		System.out.println(num1 + "<" + num2);		//the variable num2 then we proceed to print the results.
	}
		
	else
		System.out.println(num1 + "==" + num2);		//If neither of the previous conditions are true then
								//we proceed to print that both variable have the same value.

	
	}
}
