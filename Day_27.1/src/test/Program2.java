package test;

class Manager implements Cloneable{
	private int id;
	private String name;

	public Manager() {
	}

	public Manager(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Manager clone() throws CloneNotSupportedException {
		Manager manager = (Manager) super.clone();
		return manager;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}
	
	
	

}

class Bank2 implements Cloneable {
	private String BankName;
	private String branchName;
	private Manager manager;

	public Bank2() {
	}

	public Bank2(String bankName, String branchName, int id, String name) {
		this.BankName = bankName;
		this.branchName = branchName;
		this.manager = new Manager(id, name);
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public Bank2 clone() throws CloneNotSupportedException {
		Bank2 other = (Bank2) super.clone();
		other.manager = this.manager.clone();
		return other;
	}

	@Override
	public String toString() {
		return "Bank2 [BankName=" + BankName + ", branchName=" + branchName + ", manager=" + manager + "]";
	}
	
	
}

public class Program2 {
	public static void main(String[] args) {
		try {

			Bank2 b1 = new Bank2("SBI","PUNE", 11, "Rama");
			
			Bank2 b2 = b1.clone();
			
			Manager m1 = b1.getManager();
			m1.setId(22);
			
			Manager m2 = b2.getManager();
			m2.setId(33);
			
			System.out.println(b1);
			System.out.println(b2);
			

			System.out.println(b1 == b2);

//			Manager m1 = new Manager();
//			m1.setId(11);
//			m1.setName("rama");
//			b1.setManager(m1);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
