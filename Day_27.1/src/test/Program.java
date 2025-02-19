package test;


class Bank{
	private String BankName;
	private String branchName;
	
	public Bank() {
	}

	public Bank(String bankName, String branchName) {
		BankName = bankName;
		this.branchName = branchName;
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
	
	
}

public class Program {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		Bank b2 = b1;			//shallow copy
		
		System.out.println(b1 == b2);
	}
}
