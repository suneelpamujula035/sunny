package UncheckedExceptions;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception 
	{
		
		int balance = 10000, withdraw = 15000;
		if(balance<withdraw)
			throw new Exception("Insufficient funds please");
		else
			System.out.println("You can draw the amount");

	}

}
