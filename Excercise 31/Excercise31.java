// Nombre: Edgar Omar Reyes Olivas		Fecha: 02/23/19		Hora: 9:34


class Excercise31{	//Declaration of a class named Excercise31

	public static void main(String[] args){ //Declaration of the main function. Public it's an access specifier that means that you can 
	    					//call this method from outside the class (publically). Static it's an access modifier that 
	    					//creates space in memory automatically when java program is load. Void it's a return type.
	    					//Main it's the name of the method. String[] args are arguments of type String that your Java 
	    					//application accepts when you run it. 

	System.out.println("\nJava Version: "+System.getProperty("java.version")); //Gets the system property indicated by the specified key which is put in the arguments. 
										  //System it's a class. Out it's a field on the system class, 
	    									 //it's an standard output stream. Println() it's a method of the PrintStream class 
	    									//which prints any type of primitive data types and then terminates the line.

    	System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    	System.out.println("Java Home: "+System.getProperty("java.home"));
    	System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    	System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    	System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	
			
	}

}