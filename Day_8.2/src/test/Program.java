package test;

class Employee{
	private int empId;
	private String name;
	private String department;
	private String designation;
	private float salary;
	
	public Employee() {
		this.empId = 32;
		this.name= "Yarah";
		this.department = "IT";
		this.designation = "Java dev";
		this.salary = 80000.0f;
	}
	
	public void print() {
		System.out.println("Empoyee Id : "+this.empId);
		System.out.println("Empoyee name : "+this.name);
		System.out.println("Empoyee department : "+this.department);
		System.out.println("Empoyee designation : "+this.designation);
		System.out.println("Empoyee salary : "+this.salary);
	}
	
	@Override
	public String toString() {
	//	return this.empId+" "+this.name+" "+this.department+" "+this.designation+" "+this.salary;
		return String.format("%-5d%-10s%-15s%-15s%-15f", this.empId,this.name,this.department,this.designation,this.salary);
	}
	
	
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.print();
		System.out.println();
		System.out.println(emp.toString());
		
		System.out.println();
		System.out.println(emp);
		
		System.out.println();
		String str = emp.toString();
		System.out.println(str);
	}

}
