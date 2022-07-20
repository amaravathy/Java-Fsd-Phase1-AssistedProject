package Regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regularexpression1 {
	public static void main(String args[])
	{
	String regex="[a-z]+";
	String input="amar";
	
	Pattern pattern= Pattern.compile(regex);
	
	Matcher match= pattern.matcher(input);
	
	if (match.matches()) {
		System.out.println("Pattern Matched");
	}
	else {
		System.out.println("Invalid ");
	}
}
	

}
