package test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

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

	public static void find(int[] empId) {
		System.out.println("Enter Employee Id : ");
		empId[0] = sc.nextInt();
	}

	public static void printRecord(Employee emp) {
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("Employee not found");

	}

	public static void removeStatus(boolean status) {
		if (status)
			System.out.println("Employee Removed Successfully");
		else
			System.out.println("Error Occured");
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Employees ");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Print Employees");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

	//	SetTest set = new SetTest(new TreeSet<>(/* new SortByEmpId()*/));
	//	SetTest set = new SetTest( new HashSet<Employee>() );
		SetTest set = new SetTest( new LinkedHashSet<Employee>() );
		
		Employee[] arr = Program.getEmployees();

		int[] empId = new int[1];
		int choice = 0;
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				set.addEmployee(arr);
				break;

			case 2:
				Program.find(empId);
				Employee emp = set.findEmployee(empId[0]);
				Program.printRecord(emp);
				break;
			case 3:
				Program.find(empId);
				boolean status = set.removeById(empId[0]);
				Program.removeStatus(status);
				break;
			case 4:
				set.printRecord();
				break;
			}
		}

	}
}
