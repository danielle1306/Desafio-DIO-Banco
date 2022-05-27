
// A interface é uma classe abstrata onde guardamos todos os métodos abstratos.
//Ela obriga as classes que a implementam a utilizar os seus métodos.
//Os métodos tem que ser public - são por defaut

public interface IConta {
	
	 void sacar(double valor);
		
	
	 void depositar(double valor);
		
	
	 void transferir(double valor, Conta contaDestino);
		
	 void imprimirExtrato();
	

}
