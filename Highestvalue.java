package Highestvalue;
//package : Package is name that organizes a set of related classes and interfaces similar to
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Highestvalue {
//public is a Java keyword which declares a member's access as public.
//class can be defined as a template that describes the state that the object of its type support.
//Highest is class name.	
	public static void main(String[] args) {
	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
    // TODO Auto-generated method stub
		int x,y,z,a;//int is a variable where we are using to intilize values.
		//declaring a value to the integer and x,y,z,a holds the values.
		System.out.println("Enter the three numbers");
		//system : system is a class in java language.lang package
		//out : out is the static member of system class.It's type PrintStream
		//println: which is used to print the output.
		//Inside the brackets is value which to be printed	
		Scanner sc = new Scanner (System.in);
		////here we are using scanner to scan the values which we initilize.
		x=sc.nextInt();//it will scan next token of the input as int.
		y=sc.nextInt();//it will scan next token of the input as int.
		z=sc.nextInt();//it will scan next token of the input as int.
		a=z>(x>y?x:y)?z:((x>y)?x:y);
		//we can use ternary operator to find largest number
		//returns one of two values depending on the value of a boolean expression 
		System.out.println("Print numbers:"+a);


	}

}
