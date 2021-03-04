package UncheckedExceptions;

public class Exception_02  {

	static void show()
	{
		int a=5/0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		try
		{
		show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Successfully printed");
	}

}
