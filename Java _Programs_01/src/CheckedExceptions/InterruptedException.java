package CheckedExceptions;

public class InterruptedException {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		try
		{
			Thread.sleep(6000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
