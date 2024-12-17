package main;



class Person{
	private String name;
	private int age;
	
	public Person() {
		this.name = "Yarah";
		this.age = 23;
	}
	
	public void showRecord() {
		System.out.println("Name    : "+this.name);
		System.out.println("Age     : "+this.age);
	}
}


class Employee extends Person{
	private int empId;
	private float salary;
	
	public Employee() {
		this.empId = 32;
		this.salary = 80000.0f;
	}
	
	public void showRecord() {
		super.showRecord();
		System.out.println("EmpId    : "+this.empId);
		System.out.println("Salary   : "+this.salary);
	}
	
	public void display() {
		System.out.println("Sub Class Method");
	}
	
}
public class Program {
	public static void main(String[] args) {
	//	Person person = new Person();
	//	person.showRecord();
		
	//	Employee emp = new Employee();
	//	emp.displayRecord();
		
		Person person = new Employee();
		person.showRecord();
		
		Employee emp = ( Employee )person;
	//	emp.display();
	}

}
