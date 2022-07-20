package Array;

public class Arraymulti {
	public static void main(String args[])
	{
		int array[][]= {{1,3,4},{9,8,7},{7,6,5}};
		//Printing specific value
		System.out.println("printing first row and first column value "+array[0][0]);
		//print all values 
         for (int row=0; row<=2; row++) 
         {
			for(int col=0;col<=2;col++) 
			{
				
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
			
		}
		
		
	}
	

}
