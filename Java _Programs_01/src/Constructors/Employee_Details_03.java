package Constructors;

public class Employee_Details_03 {
	
	int empid;
	String empname;
	char gender;
	int salary;
	int deptno;
	
	
	void setdata(int id,String name,char gen,int sal,int dptno)
	{
		empid=id;
		empname=name;
		gender=gen;
		salary=sal;
		deptno=dptno;

	}
	void display()
	{
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(gender);
	 System.out.println(salary);
	 System.out.println(deptno);
	}


	public static void main(String[] args) {
		
		//Assigning values to class variables using method - Third method
		
		Employee_Details_03 emp1 = new Employee_Details_03();
		emp1.setdata(101,"fahim",'M',25000,301);
		emp1.display();
		
		Employee_Details_03 emp2 = new Employee_Details_03();
		emp2.setdata(102,"ashok",'M',27000,302);
		emp2.display();
		
		Employee_Details_03 emp3 = new Employee_Details_03();
		emp3.setdata(103,"gulam",'M',30000,303);
		emp3.display();
		
		Employee_Details_03 emp4 = new Employee_Details_03();
		emp4.setdata(104,"guru",'M',25000,301);
		emp4.display();

	}

}
