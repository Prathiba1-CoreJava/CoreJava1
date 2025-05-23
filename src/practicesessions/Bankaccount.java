package practicesessions;

public class Bankaccount {

	private double balance;
	
	
	//Instantiate constructor
	public Bankaccount (double initialbalance) {
		this.balance = initialbalance;
	}
	
	
	public double getBalance() {
	return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance +=amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && this.balance - amount>=0) {
			this.balance -= amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Bankaccount obj1 = new Bankaccount(1000.00);
		System.out.println(obj1.balance);
		
		obj1.deposit(200.00);
		System.out.println(obj1.getBalance());
		
		obj1.withdraw(-800.00);
		System.out.println("obj.getBalance");
	}}