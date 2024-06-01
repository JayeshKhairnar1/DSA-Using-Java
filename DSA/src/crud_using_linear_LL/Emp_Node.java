package crud_using_linear_LL;
public class Emp_Node {

	int employee_ID;
	String name;
	char gender;
	double salary;
	Emp_Node next;
	public Emp_Node(int employee_ID, String name, char gender, double salary) {
		super();
		this.employee_ID = employee_ID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		next = null;
		System.out.println("Employee created successfully with id : "+employee_ID+" Name: "+name);
	}
	

}
