package Constructors;

public class Employee_Details_01 {
	
	int empid;
	String empname;
	char gender;
	int salary;
	int deptno;
	
	void display()
	{
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(gender);
	 System.out.println(salary);
	 System.out.println(deptno);
	}

	public static void main(String[] args) {
		
		//Assigning values to class variables using object - First method(Direct method)
		
		Employee_Details_01 emp1 = new Employee_Details_01();
		
		emp1.empid=101;
		emp1.empname="suneel";
		emp1.gender='M';
		emp1.salary=20000;
		emp1.deptno=1;
		emp1.display();
				
				
        Employee_Details_01 emp2 = new Employee_Details_01();
		
		emp2.empid=102;
		emp2.empname="pawan";
		emp2.gender='M';
		emp2.salary=22000;
		emp2.deptno=2;
		emp2.display();
				
				
        Employee_Details_01 emp3 = new Employee_Details_01();
		
		emp3.empid=103;
		emp3.empname="tiru";
		emp3.gender='M';
		emp3.salary=21500;
		emp3.deptno=3;
		emp3.display();
		
		
		Employee_Details_01 emp4 = new Employee_Details_01();
			
		emp4.empid=104;
		emp4.empname="suresh";
		emp4.gender='M';
		emp4.salary=23000;
		emp4.deptno=3;
		emp4.display();
	}

}
