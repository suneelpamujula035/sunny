package java_programs_01;

public class Methods_Array_Parameter {

	int sum;
	void display(int[] temp)
	{
		for(int x:temp)
		{
			System.out.println(x);
			sum=sum+x;
			
		}
		System.out.println("Total : "+sum);

	}
	public static void main(String[] args) {

		int arr[] = {13,29,67,85,254};
		Methods_Array_Parameter m = new Methods_Array_Parameter();
		m.display(arr);
	}

}
