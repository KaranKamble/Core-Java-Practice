package test;

class Person {
	private String name;
	private String city;

	public Person() {
		System.out.println("Person.Person()");
	}

	public Person(String name, String city) {
		System.out.println("Person.Person(String name, String city)");
		this.name = name;
		this.city = city;
	}
	
	public void print() {
		System.out.println("Name  : "+this.name);
		System.out.println("City  : "+this.city);
	}

}

class Employee extends Person {

	private int empId;

	public Employee() {
		System.out.println("Employee.Employee()");
	}

	public Employee(int empId) {
		super("Yarah", "Pune");
		System.out.println("Employee.Employee( int empId )");
		this.empId = empId;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("EmpId : "+this.empId);
	}

}

public class Program {

	public static void main(String[] args) {
		// Employee emp = new Employee( 32 );

		Person p1 = new Employee(32);
		p1.print();
	}

}
