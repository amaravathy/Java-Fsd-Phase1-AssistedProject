package basic;

import java.util.Scanner;

public class Typecasting {
	public static void main(String args[])
	{
		//Implicit Conversion 
		//to get input 
		Scanner get=new Scanner(System.in);
		//to enter a character
		System.out.println("Enter a Character");
		//Reading input from user
	    char c=get.next().charAt(0);
	    System.out.println("Implicit Conversion\n");
	    int d=c;
	    System.out.println("Char to int:"+d);
	    float e=c;
	    System.out.println("int to float:"+e);
	    long g=c;
	    System.out.println("float  to long:"+g);
	    double h=c;
	    System.out.println("long  to double:"+h);
	    
	    
	    //Explicit Conversion
	    //to enter a number
	    System.out.println("\nExplicit Conversion\n");
		System.out.println("Enter a Number");
		//Reading input from user
		int n=get.nextInt();
	    //Storing char int type into char data type
		char a=(char) n;
		//Displaying conversion
		System.out.println("int to char type\n"+a);	
		
	}
	

}
