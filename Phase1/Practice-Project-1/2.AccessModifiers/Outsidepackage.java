package Access;

import basic.Accessmodifier;

public class Outsidepackage {
	public static void main(String args[])
	{
	Accessmodifier obj= new Accessmodifier();
	//Outside the package private,protected,default cannot be access.
	obj.methodPrivate();
	obj.methodProtected();
	obj.methodDefault();
	obj.methodPublic();
	}

}
