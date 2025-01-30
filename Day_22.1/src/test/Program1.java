package test;

@FunctionalInterface
interface Test1 {

	Employee get(String name, int empId, double salary);
}

public class Program1 {
	
	public static void main(String[] args) {
	//	Test1 t1 = (String name, int empId, double salary) -> new Employee("Satya", 101, 850000);
		Test1 t1 = Employee :: new; //Constructor reference
		
		Employee emp = t1.get("Satya", 101, 850000);
		System.out.println(emp);
	}

	
	public static void main3(String[] args) {
		Test1 t1 = (String name, int empId, double salary) -> new Employee("Satya", 101, 850000);
		
		Employee emp = t1.get("Satya", 101, 850000);
		System.out.println(emp);
	}

	public static void main2(String[] args) {
		Test1 t1 = (String name, int empId, double salary) -> new Employee("Satya", 101, 850000);
		
		Employee emp = t1.get("Satya", 101, 850000);
		System.out.println(emp);
	}

	public static void main1(String[] args) {

		Test1 t1 = (String name, int empId, double salary) -> {
			Employee emp = new Employee();
			emp.setEmpId(empId);
			emp.setName(name);
			emp.setSalary(salary);
			return emp;
		};

		Employee emp = t1.get("Satya", 101, 850000);
		System.out.println(emp);

	}
}
