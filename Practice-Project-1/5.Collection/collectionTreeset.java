package Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class collectionTreeset {
	public static void main(String args[])
	{
		Set<String> treeset = new TreeSet<String>(); 
		treeset.add("book");
		treeset.add("note");
		treeset.add("paper");
		treeset.add("null");//do not allow null value
		treeset.add("pen");
		treeset.add("pencil");
		
		
		//print after adding treeset size
	    System.out.println("After adding elements:" +treeset.size());
	    
	    System.out.println(treeset);
	    
	  //check using contain
		System.out.println("it contains pen?" +treeset.contains("pen"));
		
		//iterate using for loop
				for(String S:treeset)
				{
					System.out.println("For loop:" +S);
				
				}
				
				//iterate using iterator
				Iterator<String>itr=treeset.iterator();
				while(itr.hasNext())
				{
					System.out.println("Iterator:" +itr.next());
							
				}
			
		
		
	}
	

}
