package Method1;

public class Methodoverloading {
    //same methods different number of parameters.
	int add(int a,int b)
	{
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	float add(float a,float b)
	{
		return a+b;
	}
	
	double add(double a,double b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		Methodoverloading obj=new Methodoverloading();
		
		System.out.println("add of 2 and 4 "+obj.add(2,4));
	
		System.out.println("add of 2,3and 4 "+obj.add(2,3,4));
		
		System.out.println("add of 2.3 and 4.5 "+obj.add(2.3f,4.5f));
		
		System.out.println("add of 2.3 and 4.5 "+obj.add(2.3,4.5));
				
		
	}
	
}
