// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/25/19		Hora: 12:38

import java.util.Scanner; //I include the external class Scanner on this line.

class Excercise37{	//Declaration of a class named Excercise37

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
	
	
	System.out.println("Input a String: "); //Asks the user to input a string. System it's a class. Out it's a field on the system class, 

						//it's an standard output stream. Println() it's a method of the PrintStream class 

						//which prints any type of primitive data types and then terminates the line.



	String text = input.nextLine();		//Initialization of the variable text which value is the scan of the next 

						//token of the input as an String. Input is the name of the object, the dot 

						//operator is used to call the methods of the class Scanner and we leave empty 

						//parenthesis because there are no arguments to fill with.
	
	char[] CharText = text.toCharArray();	//Initialization of the array CharText which it's going to hold char elements. 
					       //The number of elements that the array holds it's determined by the method to CharArray which 
					      //converts the string text to a new character array.

	
	String reverseString = "";			//Initialization of the variable reverseString.	
	for(int i = CharText.length; i > 0; i--){	//On a for loop, we inicilitate the variable i to value of the length of the array CharText. The length is obtained
							//from the lenght property of the String class. There will be an iteration as long as the value of the variable i 
							//is bigger than 0. After every iteration the value of the variable i will decrement. 
		reverseString += CharText[i-1];		//In every iteration the value in the array CharText from the position i-1 will append to the reverseString String.
	}	
		System.out.println(reverseString);	//Print the result.
	
	}
}


