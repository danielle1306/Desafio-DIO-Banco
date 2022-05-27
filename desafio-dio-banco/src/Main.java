
public class Main {

	public static void main(String[] args) {
		
		Cliente Danielle = new Cliente();
		Danielle.setNome("Danielle");
		
		Conta cc = new contaCorrente(Danielle);
		contaPoupanca poupanca = new contaPoupanca(Danielle);
		cc.depositar(100);
				
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
