package lecture.lab1;

public class bankAccountTest {
public static void main(String [] args) {
	bankAccount aliceBank = new bankAccount(100.00, "Alice", "savings", 50.00);
	bankAccount bobBank = new bankAccount(350.00, "Bob", "checking", 30.00);
	
	bobBank.withDraw(200);
	aliceBank.deposit(50);
	bobBank.withDraw(1000);
	bobBank.transfer(aliceBank, 75);
	
	System.out.println(aliceBank.toString());
	
	System.out.println(bobBank.toString());
}
}
