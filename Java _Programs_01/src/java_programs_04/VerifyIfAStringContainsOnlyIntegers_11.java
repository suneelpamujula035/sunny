package java_programs_04;

public class VerifyIfAStringContainsOnlyIntegers_11 {

	public static void main(String[] args) {

		String x = "42fgf35jtr";
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while(i!=size)
		{
			if(y[i]>='0' && y[i]<='9')
			{
				i++;
			}
			else
			{
				System.out.println("Not an integer string");
				System.exit(i);//This is used to stop execution
			}
		}
		System.out.println("Integer String");
	}

}
