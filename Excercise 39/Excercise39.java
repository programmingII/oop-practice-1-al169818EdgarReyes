// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/25/19		Hora: 4:32


class Excercise39{	//Declaration of a class named Excercise39

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

		for(int i = 1; i <= 4 ; i++){		//Initialization of the variable i.
			for(int j = 2; j <= 4; j++){
				for(int k = 3; k <= 4; k++){
					System.out.println(i+""+j+""+k);
				}
			}
		}
	
	}
}


