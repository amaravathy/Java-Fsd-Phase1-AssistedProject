package String;

public class Stringmethod {
	public static void main(String[] args) {
		 String s1 = new String("Welcome to the new beginning");
		 
		 char c= s1.charAt(2);
		 System.out.println("Character at index 2: "+c);
		 
		 System.out.println("Length: "+s1.length());
		 
		 //converting to uppercase
		 System.out.println("UPPER CASE: "+s1.toUpperCase());
		 //converting to lowercase
		 System.out.println("lowercase: "+s1.toLowerCase());
		 //to check the word 
		 System.out.println("Check the String contains word? : "+s1.contains("World"));
		 //sub string 
		 System.out.println("SubString between 6 to 10 characters: "+s1.substring(6,10));
		 
		 String result[]= s1.split(" ");
		 
		 for(String s: result) {
			 System.out.println(s);
		 }
		 
		 //comparison of s1 and s2
		 
		 String s2= "welcome to the new beginning";
		 //case of equal
		 if(s1.equals(s2)) {
			 System.out.println("Equal");
		 }
		 else {
			 System.out.println("Not Equal");
		 }
		 //case of equal ignorecase
		 if(s1.equalsIgnoreCase(s2)) {
			 System.out.println("Equal");
		 }
		 else {
			 System.out.println("Not Equal");
		 }
		 //comparison using ==
		 if(s1==s2) {
			 System.out.println("Equal");
		 }
		 else {
			 System.out.println("Not Equal");
		 }
		 
	}
}
