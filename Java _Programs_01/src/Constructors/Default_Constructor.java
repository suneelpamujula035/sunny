package Constructors;

public class Default_Constructor {
	int age;
	String name;
	char gender;
	
	public void show()
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}

	public static void main(String[] args) {
		
		Default_Constructor d1 = new Default_Constructor();
		d1.age=25;
		d1.name="Praveen";
		d1.gender='M';
		d1.show();
		
		Default_Constructor d2 = new Default_Constructor();
		d2.age=42;
		d2.name="Prasad";
		d2.gender='M';
		d2.show();

	}

}
