package java_programs_04;

public class PangramProgram_15 {

	public static void main(String[] args) {

		// THE QUICK BROWN FOX JUMPS OVER A LAZY DOG
		String x = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		x = x.replace(" ", "");
		char[] y = x.toCharArray();
		int size = y.length;//33
		int a[] =  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i = 0;
		while(i!=size)
		{
			int index = y[i]-65;
			a[index] = 1;
			i++;
		}
		
		while(i!=26)
		{
			if(a[i]==1)
			{
				i++;
			}
			else
			{
				System.out.println("Non-Pangram");
				System.exit(0);
			}
		}
		System.out.println("Pangram");
		
	}

}
