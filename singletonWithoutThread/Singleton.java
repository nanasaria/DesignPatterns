package singletonWithoutThread;

//Declara��o da classe Singleton.
public class Singleton {

	// Declara��o da vari�vel de inst�ncia `instance`.
	private static Singleton instance;
	
	//Declara��o da vari�vel `data` String.
	private String data;
	
	// Declara��o do construtor privado da classe
	private Singleton(String data) {
		this.data = data;
	}
	
	//Declara��o do m�todo `getInstance` para obter a inst�ncia �nica.
	public static Singleton getInstance(String data) {
		//Verifica��o se a inst�ncia � nula.
		// Verifica��o novamente se a inst�ncia � nula
		if(instance == null) {
			//Cria��o de uma nova inst�ncia da classe Singleton com o argumento `data`.
			instance = new Singleton(data);
		}
		//Retorno da inst�ncia
		return instance;
	}
}
