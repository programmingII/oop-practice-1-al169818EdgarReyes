// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/25/19		Hora: 5:06

import java.util.Scanner;

class Excercise38{	//Declaration of a class named Excercise38

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	
		Scanner input = new Scanner(System.in); // Declaration of an object named input of the class Scanner. Then with the new 
						//operator we create an object and call the constructor that is Scanner. Finally
						//we initialize the object with the argument System.in which is an input stream.
		
		System.out.println("Input a String: ");

		String text = input.nextLine();

		char[] charArray = text.toCharArray();
	
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;

		for(int i = 0; i < charArray.length; i++){
			if(Character.isLetter(charArray[i]))
				letter++;
			else if(Character.isSpaceChar(charArray[i]))
				space++;
			else if(Character.isDigit(charArray[i]))
				number++;
			else
				other++;
		}
		
		System.out.println("The string is: " + text);
		System.out.println("Letters: "+ letter);
		System.out.println("Spaces: " + space);
		System.out.println("Number: " + number);
		System.out.println("Other: " + other);

	}
}

