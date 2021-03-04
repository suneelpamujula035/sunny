package UncheckedExceptions;

public class NoMoneyException extends Exception{
	
	public NoMoneyException(String message)
	{
		super(message);
	}
	

	public static void main(String[] args) throws NoMoneyException
	{
		int balance = 500, withdraw_amount = 1000;
		if(balance<withdraw_amount)
			throw new NoMoneyException("Sorry, not enough balance please");
	}

	}

