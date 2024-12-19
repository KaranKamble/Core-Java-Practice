package test;

class Person{   		//super/ parent
	int age;
	String name;
	
	public Person() {
		this.age = 24;
		this.name = "John";
	}
	
	public void print() {
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
}

class Employee extends Person{		//sub / child
	int empId;
	
	public Employee() {
		this.empId =32;
	}
	
	public void show() {
		System.out.println("EmpId : "+empId);
	}
	
	
}

public class Program {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();
		
//		Employee emp = new Employee();
		System.out.println();
//		emp.show();
		
		Person p2 = new Employee();   		//Up casting
		
		Employee emp =  (Employee )p2;		//Down casting
		emp.show();
		
		
		
		

	}

}
