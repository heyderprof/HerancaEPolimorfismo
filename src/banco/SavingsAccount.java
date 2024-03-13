package banco;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(int number, String holder, double balance, double interestRate, TypeAccount type) {
		super(number, holder, balance, type);
		this.interestRate = interestRate;
	}
	
	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalence() {

	}
	
	public String toString() {
		return "Conta nº " + number + " type: " + type + "\nHolder: " + holder + "\nBalance: " + balance + "\nRate: " + interestRate + "\n";		
	}
	
	@Override // anotação para indicar sobreposição ou sobrecarga
	public void withdraw(double ammount) { // recriei o método withdraw para que a taxa de 5,00 não seja descontada quando a conta for do tipo SavingsAccount
		balance -= ammount; 
		
	}

}
