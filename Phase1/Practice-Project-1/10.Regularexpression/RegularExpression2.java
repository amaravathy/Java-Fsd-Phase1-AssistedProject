package Regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression2 {
	public static void main(String[] args) {
		String regex="[987]{3}[0-9]{7}";
	    String input="9874527814";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if (match.matches()) {
			System.out.println("Pattern Matched");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
