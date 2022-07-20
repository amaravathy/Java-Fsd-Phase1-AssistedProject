package basic;

public class Methodtest {
	public static void main(String args[])
	{
	Accessmodifier obj= new Accessmodifier();
	//within class private cannot be access.
	obj.methodPrivate();
	obj.methodPublic();
	obj.methodProtected();
	obj.methodDefault();
	}

	

}
