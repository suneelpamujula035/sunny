package UncheckedExceptions;

public class GetMessageMethod {
	public static void GetMessageMethod()
	{
		int a = 15, b = 0;
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			System.out.println("Program exited");
		}
	}

	public static void main(String[] args) {
		
		GetMessageMethod();

	}

}
