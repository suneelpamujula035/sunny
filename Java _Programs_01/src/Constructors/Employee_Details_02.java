package Constructors;

public class Employee_Details_02 {
	int empid;
	String empname;
	char gender;
	int salary;
	int deptno;
	static String company="Cognizant";
	
	Employee_Details_02(int id,String name,char gen,int sal,int dptno, String company)//parameters data type and variable name.
	{
		empid=id;
		empname=name;
		gender=gen;
		salary=sal;
		deptno=dptno;
		this.company=company;
		
	}
	void display()
	{
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(gender);
	 System.out.println(salary);
	 System.out.println(deptno);
	 System.out.println(company);
	}



	public static void main(String[] args) {
		
		//Assigning values to class variables using constructor - Second method
		
		Employee_Details_02 emp1 = new Employee_Details_02(101,"prasanth",'M',30000,11,company);
	    emp1.display();
	    
	    Employee_Details_02 emp2 = new Employee_Details_02(102,"vinod",'M',35000,12,company);
	    emp2.display();
	    
	    Employee_Details_02 emp3 = new Employee_Details_02(103,"fahim",'M',40000,13,company);
	    emp3.display();
	    
	    Employee_Details_02 emp4 = new Employee_Details_02(104,"anil",'M',55000,14,company);
	    emp4.display();
				

	}

}
