package Exceptionhandling;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Finally1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		
		try {
			
			int num= sc.nextInt();
			System.out.println("Value: "+num);
			
		} 
		catch (InputMismatchException e) {
			//  handle exception
			System.out.println("Wrong input given");
		}
		finally {
			sc.close();
			System.out.println("Scanner Closed Successfully");
		}
		
	}

}
