package banco;

public class Program {

	public static void main(String[] args) {
	
		Account conta1 = new Account(0001, "Heyder V Ramos", 1000, TypeAccount.NORMAL);
		System.out.println(conta1);
		
		Account conta2 = conta1;
		
		System.out.println(conta2);
		
		SavingsAccount conta3 = new SavingsAccount(0003, "Ana Maria", 1000, 0.5, TypeAccount.SAVINGS);

		System.out.println(conta3);
		
		// UPCASTING // superclasse <= classe
		
		Account conta4 = new SavingsAccount(0004, "Adilson Ramos", 9999.99, 0.7, TypeAccount.SAVINGS);
		Account conta6 = new BusinessAccount(0006, "Adilson Ramos", 1000, TypeAccount.BUSINESS, 1000);

		// isso é polimorfismo
		// variáveis do mesmo tipo genérico (Account) apontando para objetos de tipos específicos diferentes
		// (SavingsAccount e BusinessAccount), tendo comportamentos diferentes conforme cada tipo específico
		// No objeto SavingsAccount, metodo withdraw não realiza descontos, já em BusinessAccount é cobrada taxa de 5,00
		
		
		System.out.println(conta4);
		
		// DOWNCASTING
		
		SavingsAccount conta5 = (SavingsAccount)conta4;
		conta5.number = 0005;
		System.out.println(conta5);
		
		if (conta4 instanceof SavingsAccount) {
			
			System.out.println("Account nº " + conta4.number + " is Savings Account");
			
		}
		else if (conta4 instanceof BusinessAccount) {
			
			System.out.println("Account nº " + conta4.number + " is Business Account");
			
		}
		
		else {
			System.out.println("Account nº " + conta4.number + " is Normal Account");
		}
		
		
		
		// testando saques com métodos sobrepostos
		System.out.println(" ");
		System.out.println("Demonstrando a sobreposição de métodos");
		System.out.println("Saldo em conta: ");
		System.out.print("Conta 1: ");
		System.out.println(conta1.getBalance());
		System.out.print("Conta 3: ");
		System.out.println(conta3.getBalance());
		System.out.print("Conta 6: ");
		System.out.println(conta6.getBalance());
		
		System.out.println("Efetuando desconto de R$200,00: ");

		conta1.withdraw(200); // esta conta é do tipo normal
		conta3.withdraw(200); // esta conta é do tipo savings
		conta6.withdraw(200); // esta conta é do tipo business // polimorfismo
		
		// polimorfismo = variáveis do mesmo tipo genérico (Account) apontando para objetos de tipos específicos diferentes
		
		System.out.println("Saldo em conta atualizado: ");
		System.out.print("Conta 1: ");
		System.out.println(conta1.getBalance());
		System.out.print("Conta 3: ");
		System.out.println(conta3.getBalance());
		System.out.print("Conta 6: ");
		System.out.println(conta6.getBalance());
		
	}
	
	

}
