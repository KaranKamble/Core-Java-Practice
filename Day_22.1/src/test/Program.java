package test;

@FunctionalInterface
interface Test{
	
	String get( Employee emp );
}
public class Program {
	
	public static void main(String[] args) {
	//	Test t = emp -> emp.getName();
		Test t = Employee :: getName;
		
		Employee employee = new Employee("Satya",101,850000);
		String name = t.get(employee);
		System.out.println(name);
	}

	public static void main1(String[] args) {
		
		Test t = emp -> emp.getName();
		
		Employee employee = new Employee("Satya",101,850000);
		String name = t.get(employee);
		System.out.println(name);
		
	}
}
