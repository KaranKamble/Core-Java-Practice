package test;

import java.util.Set;

public class SetTest {
	private Set<Employee> set;

	public SetTest() {
	}

	public SetTest(Set<Employee> set) {
		this.set = set;
	}

	public void setSet(Set<Employee> set) {
		this.set = set;
	}

	public void addEmployee(Employee[] arr) {
		if (this.set != null && arr != null) {
			for (Employee element : arr) {
				this.set.add(element);
			}
		}
	}

	public Employee findEmployee(int empId) {
		if (this.set != null) {
			for (Employee employee : this.set) {
				if (employee.getEmpId() == empId)
					return employee;
			}
		}
		return null;
	}

	
	public boolean removeById(int empId) {
		if (this.set != null) {
			Employee key = new Employee();
			key.setEmpId(empId);
			if (this.set.contains(key)) {
				this.set.remove(key);
				return true;
			}
		}
		return false;
	}

	public void printRecord() {
		if (this.set != null) {
			for (Employee element : set)
				System.out.println(element);
		}

	}

}
