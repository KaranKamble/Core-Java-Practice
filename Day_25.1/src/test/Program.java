package test;

class Employee {
	private int empId;
	private String name;
	private String city;
	private String email;
	
	private Employee( employeeBuilder builder ) {
		this.empId = builder.empId;
		this.name = builder.name;
		this.city = builder.city;
		this.email = builder.email;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + ", email=" + email + "]";
	}



	public static class employeeBuilder {
		private int empId;
		private String name;
		private String city;
		private String email;

		public employeeBuilder setEmpId(int empId) {
			this.empId = empId;
			return this;
		}

		public employeeBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public employeeBuilder setCity(String city) {
			this.city = city;
			return this;
		}

		public employeeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	}

}

public class Program {
	public static void main(String[] args) {
			Employee emp = new Employee.employeeBuilder()
					.setEmpId(32)
					.setName("Yarah")
					.setEmail("abc@gmail.com")
					.setCity("Pune")
					.build();
			
			System.out.println(emp);
	}
}
