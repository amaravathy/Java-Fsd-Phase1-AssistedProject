package Innerclass;

public class LocalInnerclass {
	//OUTER CLASS
	void check(String departmentname)
	{
		if(departmentname=="Computerscience")
		{
			//inner class
			class Inner{
				void validate()
				{
					System.out.println("You are under this department");
				}
			}
			//inner class object
			Inner inner=new Inner();
			inner.validate();
		}
	
	else
	{
		System.out.println("You are not under this department");
	}
	}
	
	public static void main(String args[])
	//outer class object
	{
	  LocalInnerclass outer=new LocalInnerclass();
	  outer.check("Computerscience");
	}

}
