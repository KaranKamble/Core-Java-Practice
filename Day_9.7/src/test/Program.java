package test;

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable{

	private static final long serialVersionUID = -2721398669728881826L;
	private String name;
	private static int empId;
	private transient float salary;

	public Employee() {
	}

	public Employee(String name, int empId, float salary) {
		this.name = name;
		Employee.empId = empId;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}
	
	public static int getEmpId() {
		return empId;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

}

public class Program {

	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String path) throws Exception {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path))));){
			
			Employee emp = new Employee("Rushi",78,75000.0f);
			outputStream.writeObject(emp);
		}
	}

	private static void readRecord(String path) throws Exception {
		try( ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(path))));){
			
			Employee emp = (Employee) inputStream.readObject();
			System.out.println(emp);
		}
	}

	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Write");
		System.out.println("2.Read");
		System.out.println("Enter Your Choice :  ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		int choice = 0;

		while ((choice = Program.menuList()) != 0) {

			switch (choice) {
			case 1:
				try {
					Program.writeRecord("file.dat");
					Employee emp = new Employee();
					emp.setName("Raj");
					Employee.setEmpId(48);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					Program.readRecord("file.dat");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}
