package Access_Modifiers_01;
class A                          //private: Variables,methods and constructors access only within the class
{
	 private int i = 10;
	private void m1()
	{
		System.out.println(i);
	}
}

public class Private_Example {

	public static void main(String[] args) {
		A obj = new A();
//		obj.i=25;   //Can't access since it is private
//		obj.m1();   //Can't access since it is private

	}

}
