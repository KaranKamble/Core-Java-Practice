package test;

import java.util.Objects;

public class Employee {

	private int impId;
	private String name;
	private String city;
	
	public Employee() {
	}

	public Employee(int impId, String name, String city) {
		this.impId = impId;
		this.name = name;
		this.city = city;
	}

	public int getImpId() {
		return impId;
	}

	public void setImpId(int impId) {
		this.impId = impId;
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

	
	
	@Override
	public int hashCode() {
		return Objects.hash(impId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return impId == other.impId;
	}

	@Override
	public String toString() {
		return "Employee [impId=" + impId + ", name=" + name + ", city=" + city + "]";
	}

}
