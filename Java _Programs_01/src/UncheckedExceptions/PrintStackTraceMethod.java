package UncheckedExceptions;

public class PrintStackTraceMethod {
	public static void PrintStackTraceMethod()
	{
		int a []=new int[4];
		try
		{
			a[7]=22;
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program exited");
		}
	}

	public static void main(String[] args) {
		
		PrintStackTraceMethod();

	}

}
