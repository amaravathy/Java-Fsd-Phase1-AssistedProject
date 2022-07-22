package Exceptionhandling;

public class Customexceptionuser {
static void check(int age) throws Customexception {
		
		if(age<18)
			throw new Customexception("User Can not Vote Before 18");
		else
			System.out.println("User can Vote");
		
	}
	
	
	public static void main(String[] args) {
				try {
					check(19);
				} catch (Customexception e) {
					
					
					System.out.println(e);
				}
	}

}
