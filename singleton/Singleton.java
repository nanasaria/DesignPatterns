package singleton;

/**
1. A classe Singleton � definida. O modificador public torna a classe acess�vel a qualquer outra classe no projeto. J� final impede a cria��o de subclasses de Singleton, refor�ando a ideia de uma �nica inst�ncia.
2. A vari�vel instance � declarada como static para haver apenas uma c�pia dela.
3. O Try indica um atraso de um segundo na inicializa��o usando Thread.sleep(1000).
4. Catch � o bloco que indica erro caso tente realizar o atraso e por algum motivo, n�o consiga.
5. O m�todo getInstance(String value) permite que qualquer classe acesse a inst�ncia �nica de Singleton.
6. Verifica��o da inst�ncia, caso seja nula, significa que n�o foi criada.
7. Caso n�o tenha sido criada, � passado um construtor privado com o valor recebido.
7. O m�todo return ir� retornar a inst�ncia Singleton, seja a nova ou a que j� existia.
 */

public final class Singleton {
	
	private static Singleton instance;
    public String value;
    
    private Singleton(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

}
