
public class contaCorrente extends Conta {	
	
	public contaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		
		System.out.println("=== Extrato ContaCorrente ===");
		
		super.imprimirInfosComuns();
		
		
	}

	
}
	
		


