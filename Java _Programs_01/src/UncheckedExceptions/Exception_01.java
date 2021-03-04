package UncheckedExceptions;

public class Exception_01 {

	static void display(int age)
	{
		if(age<18)
		{
		     throw new java.lang.ArithmeticException("You are not eligible for vote");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
	}
	public static void main(String[] args) {

		display(24);
		System.out.println("Successfully printed");
	}

}
