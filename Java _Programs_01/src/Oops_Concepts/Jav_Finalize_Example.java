package Oops_Concepts;

public class Jav_Finalize_Example {

	public static void main(String[] args) {
		
		Jav_Finalize_Example obj = new Jav_Finalize_Example();
		System.out.println(obj.hashCode());
		obj = null;
		System.gc();
		System.out.println("End of Garbbage Collection");

	}
	{
		System.out.println("Finalize method called");
	}

}
