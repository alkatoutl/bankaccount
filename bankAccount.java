package lecture.lab1;

public class bankAccount {
	public double balance;
	private String ownerName;
	private String accountType;  
	private double overdrawLimit;
	private double withdrawl;
	
	public bankAccount(double balance, String ownerName) {
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public bankAccount(double balance, String ownerName, String accountType, double overdrawLimit) {
		this.balance = balance;
		this.ownerName = ownerName;
		this.accountType = accountType;
		this.overdrawLimit = overdrawLimit;
	}

	public void SetOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void SetAccountType(String accountType) {
		this.accountType = accountType; 
		}
	
	public void SetWithdrawl(double withdrawl) {
		this.withdrawl = withdrawl;
	}
	
	public void SetOverdrawLimit(double overdrawLimit) {
		this.overdrawLimit = overdrawLimit;
	}
	
	public void SetBalance(double balance) {
		if(this.balance >= overdrawLimit) {
			this.balance = balance;
		}
	}
	public double GetBalance() {
		return balance;
	}
	
	public double withDraw(double amount) {
		if(accountType.equalsIgnoreCase("savings")) {
			amount += 3;
		}
		if((balance - amount) >= overdrawLimit) {
			balance = (balance - amount);
		}
		
		return amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public boolean transfer(bankAccount to , double amount) {
		if((balance - amount) >= overdrawLimit) {
			to.balance += amount;
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Name of account owner:" + this.ownerName + ", " 
				+ "Account type:" + this.accountType + ", "
				+ "Balance in account:" + this.balance + ", "
				+ "Overdraw limit:" + this.overdrawLimit;
	}
	
}