//Nombre: Edgar Omar Reyes Olivas 	Fecha: 02/07/2019		Hora: 12:27

import java.util.Scanner; //On this line I include the external class Scanner.

class Excercise7{	//Declaration of a class named Excerise7
	
	public static void main(String args[]){  //Declaration of the main function. Public it's an access specifier that means that you can 
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
		
	int n = input.nextInt();		//Initialization of the variable nh which value is the scan of the next 
						//token of the input as an int. Input is the name of the object, the dot 
						//operator is used to call the methods of the class and we leave empty 
						//parenthesis becasue there are no arguments to fill with.
	
	for(int i = 1; i <= 10; i++){		//Use of a for loop. Initialization of the variable i with value 1. 
						//Loop will stop until i's value is less or equal to 10.
						//i's value will increment by 1 after each iteration.
		
		System.out.println(n + " * " + i  + " = " + (n*i)); //Print the value of n then it concatenates with * and then with 
							            //the value of i and then it concatenates with =, finally it 
								    //concatenates with te product of n and i.
	}

	}
}
