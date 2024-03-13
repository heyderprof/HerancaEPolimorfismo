package banco;

public class Account {
	
	protected int number;
	protected String holder;
	protected double balance;
	protected TypeAccount type;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance, TypeAccount type) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public TypeAccount getType() {
		return type;
	}

	public void setType(TypeAccount type) {
		this.type = type;
	}

	public void withdraw(double ammount) {
		balance -= ammount + 5.0; // saque: subtrai o valor sacado da conta e ainda desconta 5,00 como taxa.
		
	}
	
	public void deposit(double ammount) {
		balance += ammount;
		
	}
	
}
