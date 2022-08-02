package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashset {
	public static void main(String args[])
	{
	HashSet <Integer> hashset=new HashSet<Integer>();
	
	//adding in hashset
	hashset.add(10);
	hashset.add(34);
	hashset.add(89);
	hashset.add(78);
	hashset.add(98);
	hashset.add(34);
	hashset.add(null);
	hashset.add(34);//do not allow duplicate values
	
	//print after adding hash size
    System.out.println("After adding elements:" +hashset.size());
    
	//print after adding hash size
	System.out.println(hashset);
	
	//removing null
	hashset.remove(null);
	System.out.println(hashset);
	
	//check using contain
	System.out.println("it contains 34?" +hashset.contains(34));
	
	//iterate using for loop
		for(int S:hashset)
		{
			System.out.println("For loop:" +S);
		
		}
		
		//iterate using iterator
		Iterator<Integer>itr=hashset.iterator();
		while(itr.hasNext())
		{
			System.out.println("Iterator:" +itr.next());
					
		}
	
	}
}
