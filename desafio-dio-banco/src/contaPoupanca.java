
public class contaPoupanca extends Conta{
	public contaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {		

		System.out.println("=== Extrato ContaPoupanca ===");
		
		super.imprimirInfosComuns();
		
	}

	
}

