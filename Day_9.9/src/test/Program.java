package test;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private int empId;
	private String name, job, hireDate, department;
	private float salary;

	public Employee() {
	}

	public Employee(int empId, String name, String job, String hireDate, float salary, String department) {
		this.empId = empId;
		this.name = name;
		this.job = job;
		this.hireDate = hireDate;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format("%-7d%-15s%-15s%-15s%-10.2f%-15s", this.empId, this.name, this.job, this.hireDate,
				this.salary, this.department);
	}

}

class SortByJob implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		return emp1.getJob().compareTo(emp2.getJob());
	}

}

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if( o1.getSalary() < o2.getSalary() )
			return -1;
		else if( o1.getSalary() > o2.getSalary() )
			return +1;
		return 0;
					//OR
//		return (int) (o1.getSalary() - o2.getSalary());

	}

}

public class Program {

	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[14];
		arr[0] = new Employee(7369, "SMITH", "CLERK", "1980-12-17", 800.00f, "RESEARCH");
		arr[1] = new Employee(7499, "ALLEN", "SALESMAN", "1981-02-20", 1600.00f, "SALES");
		arr[2] = new Employee(7521, "WARD", "SALESMAN", "1981-02-22", 1250.00f, "SALES");
		arr[3] = new Employee(7566, "JONES", "MANAGER", "1981-04-02", 2975.00f, "RESEARCH");
		arr[4] = new Employee(7654, "MARTIN", "SALESMAN", "1981-09-28", 1250.00f, "SALES");
		arr[5] = new Employee(7698, "BLAKE", "MANAGER", "1981-05-01", 2850.00f, "SALES");
		arr[6] = new Employee(7782, "CLARK", "MANAGER", "1981-06-09", 2450.00f, "ACCOUNTING");
		arr[7] = new Employee(7788, "SCOTT", "ANALYST", "1982-12-09", 3000.00f, "RESEARCH");
		arr[8] = new Employee(7839, "KING", "PRESIDENT", "1981-11-17", 5000.00f, "ACCOUNTING");
		arr[9] = new Employee(7844, "TURNER", "SALESMAN", "1981-09-08", 1500.00f, "SALES");
		arr[10] = new Employee(7876, "ADAMS", "CLERK", "1983-01-12", 1100.00f, "RESEARCH");
		arr[11] = new Employee(7900, "JAMES", "CLERK", "1981-12-03", 950.00f, "SALES");
		arr[12] = new Employee(7902, "FORD", "ANALYST", "1981-12-03", 3000.00f, "RESEARCH");
		arr[13] = new Employee(7934, "MILLER", "CLERK", "1982-01-23", 1300.00f, "ACCOUNTING");
		return arr;
	}

	public static void print(Employee[] arr) {
		for (Employee emp : arr)
			System.out.println(emp);

		System.out.println();
	}

	public static void main(String[] args) {
		Employee[] arr = Program.getEmployees();
		Program.print(arr);

//		Arrays.sort(arr, new SortByJob());
//		Program.print(arr);

		Arrays.sort(arr, new SortBySalary());
		Program.print(arr);

	}

}
