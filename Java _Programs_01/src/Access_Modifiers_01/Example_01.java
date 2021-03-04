package Access_Modifiers_01;

public class Example_01 {

	public int m=10;
	private int sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		int s;
		Example_01 ex = new Example_01();
		s = ex.sum(10, 40);
		System.out.println(s);
		int s1 = ex.m;
		System.out.println(s1);
		
	}
}
