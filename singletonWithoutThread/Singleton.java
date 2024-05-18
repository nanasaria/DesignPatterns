package singletonWithoutThread;

//Declaração da classe Singleton.
public class Singleton {

	// Declaração da variável de instância `instance`.
	private static Singleton instance;
	
	//Declaração da variável `data` String.
	private String data;
	
	// Declaração do construtor privado da classe
	private Singleton(String data) {
		this.data = data;
	}
	
	//Declaração do método `getInstance` para obter a instância única.
	public static Singleton getInstance(String data) {
		//Verificação se a instância é nula.
		// Verificação novamente se a instância é nula
		if(instance == null) {
			//Criação de uma nova instância da classe Singleton com o argumento `data`.
			instance = new Singleton(data);
		}
		//Retorno da instância
		return instance;
	}
}
