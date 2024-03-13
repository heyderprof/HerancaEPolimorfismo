
package banco;

public class BusinessAccount extends Account {
	
	private double loanLimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(int number, String holder, double balance, TypeAccount type, double loanLimit) {
		super(number, holder, balance, type);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public String toString() {
		return "Conta nº " + number + " - Type: " + type + "\nHolder: " + holder + "\nBalance: " + balance + "\nLoan limit: " + loanLimit + "\n";		
	}
	
	@Override // anotação para indicar sobreposição ou sobrecarga.
	public void withdraw(double ammount) { // neste exemplo, usamos super para reaproveitar o código do método withdraw da superclasse, apenas fazendo uma personalização (decontando mais 2,00)
		super.withdraw(ammount);	
		balance -= 2.0;
	}

}
