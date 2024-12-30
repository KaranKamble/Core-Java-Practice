package test;

class Employee {
	private int empId;
	private String name;
	private String department;
	private String designation;
	private float salary;

	public Employee() {

	}

	public Employee(int empId, String name, String department, String designation, float salary) {
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public void print() {
		System.out.println("Empoyee Id : " + this.empId);
		System.out.println("Empoyee name : " + this.name);
		System.out.println("Empoyee department : " + this.department);
		System.out.println("Empoyee designation : " + this.designation);
		System.out.println("Empoyee salary : " + this.salary);
	}

	@Override
	public String toString() {
		// return this.empId+" "+this.name+" "+this.department+" "+this.designation+"
		// "+this.salary;
		return String.format("%-5d%-10s%-15s%-15s%-15f", this.empId, this.name, this.department, this.designation,
				this.salary);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if (this.empId == other.empId)
			return true;
		return false;
	}

}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Satya", "IT", "Developer", 80000.0f);
		Employee emp1 = new Employee(2, "Satya", "IT", "Developer", 80000.0f);

//		if( emp == emp1)
//			System.out.println("Equals");
//		else
//			System.out.println("Not Equal");

		if (emp.equals(emp1))
			System.out.println("Equals");
		else
			System.out.println("Not Equal");

	}
}
