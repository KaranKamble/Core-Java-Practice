package test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

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

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Employees ");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Sort Employees");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}

	public static int subMenuList() {
		System.out.println("0.Exit ");
		System.out.println("1.Sort By Name ");
		System.out.println("2.Sort By Empid ");
		System.out.println("3.Sort By Department ");
		System.out.println("4.Sort By Job ");
		System.out.println("5.Sort By Salary ");
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

	//	ListTest list = new ListTest(new ArrayList<>());
	//	ListTest list = new ListTest(new LinkedList<>());
		ListTest list = new ListTest(new Vector<>());

		Employee[] arr = Program.getEmployees();
		
		int[] empId = new int[1];
		int choice = 0;
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				list.addEmployee(arr);
				break;

			case 2:
				Program.find(empId);
				Employee emp = list.findEmployee(empId[0]);
				Program.printRecord(emp);
				break;
			case 3:
				Program.find(empId);
				
				break;
			case 4:
				
				while( (choice = Program.subMenuList() ) != 0 ) {
					Comparator<Employee> sort = null;
					switch( choice ) {
					case 1 :
						sort = new SortByName();
						break;
					case 2 :
						sort = new SortByEmpId();
						break;
					case 3 :
						sort = new SortByDepartment();
						break;
					case 4 :
						sort = new SortByJob();
						break;
					case 5 :
						sort = new SortBySalary();
						break;
					}
					list.printRecord(sort);
				}
				break;
			}
		}
	}
}
