package Access_Modifiers_01;
class B                 //dafault: Variables,methods and constructors accessible only within the package
{                          //(Out side of the package not accessible)
	int i =55;
	void m1()
	{
	   System.out.println(i);
	}
}

public class Default_Example {

	public static void main(String[] args) {
		
		B b = new B();
		b.i=73;
		b.m1();

	}

}
