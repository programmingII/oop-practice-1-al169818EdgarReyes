// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/27/19		Hora: 08:41



import java.util.Scanner; //On this line I include the external class Scanner.



class Excercise66{	//Declaration of a class named Excercise66

	public static void main(String[] args){ /*Declaration of the main function. Public it's an access specifier that means that you can 

											*call this method from outside the class (publically). Static it's an access modifier that 

											*creates space in memory automatically when java program is load. Void it's a return type.

											*Main it's the name of the method. String[] args are arguments of type String that your Java 

											*application accepts when you run it.
							
											*/
											
											
	int sum = 0;
	int num = 2;
	
	
	
		
		while(num <= 100){
			
			for(int i = 2; i <= num/2 ; i++){
				System.out.println("i: " + i + "  num" + num + "mod: " + num%i);
				
				
				if(num % i != 0){
					sum += num;
				}
			}
			num++;
		}
		
		
	System.out.println("Sum of the first 100 prime numbers: " + sum);

	}
}