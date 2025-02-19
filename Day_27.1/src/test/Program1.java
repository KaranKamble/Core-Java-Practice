package test;

class Bank1 implements Cloneable {
	private String BankName;
	private String branchName;

	public Bank1() {
	}

	public Bank1(String bankName, String branchName) {
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

	@Override
	public Bank1 clone() throws CloneNotSupportedException {
		Bank1 other = (Bank1) super.clone();
		return other;
	}
}

public class Program1 {
	public static void main(String[] args) {
		try {

			Bank1 b1 = new Bank1();
			Bank1 b2 = b1.clone();	// shallow copy

			System.out.println(b1 == b2);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
