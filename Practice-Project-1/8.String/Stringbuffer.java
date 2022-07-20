package String;

public class Stringbuffer {
	public static void main(String args[])
	{
		String str1=new String("welcome to new begining");
		//Converting String to Stringbuffer
		StringBuffer s1=new StringBuffer(str1);
		System.out.println("Size:"+s1.length());
		
		//add a word
		s1.append("Join");
		System.out.println(s1);
		
		//Insert space
		s1.insert(23," ");
	    System.out.println(s1);
	    
	    //to replace between range
	    s1.replace(12,19,"rejoin");
	    System.out.println(s1);
	    
	    //to reverse a string
	    s1.reverse();
	    System.out.println(s1);
		
		
	}

}
