
// A interface � uma classe abstrata onde guardamos todos os m�todos abstratos.
//Ela obriga as classes que a implementam a utilizar os seus m�todos.
//Os m�todos tem que ser public - s�o por defaut

public interface IConta {
	
	 void sacar(double valor);
		
	
	 void depositar(double valor);
		
	
	 void transferir(double valor, Conta contaDestino);
		
	 void imprimirExtrato();
	

}
