package lecture.lab1;

public class InterestCalculator  {
	

	public static double applyInterest(bankAccount a, int years, double interestRate) {               // a = balance in bank account
		double newBalance = a.GetBalance()*(1+(interestRate/100)*(years));
		return newBalance;
	}

	public static void main(String [] args) {
		bankAccount aliceBank = new bankAccount(110.00, "Alice");
		System.out.println(InterestCalculator.applyInterest(aliceBank, 8, 5.00));
	}
}

	
