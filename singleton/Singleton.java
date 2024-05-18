package singleton;

/**
1. A classe Singleton é definida. O modificador public torna a classe acessível a qualquer outra classe no projeto. Já final impede a criação de subclasses de Singleton, reforçando a ideia de uma única instância.
2. A variável instance é declarada como static para haver apenas uma cópia dela.
3. O Try indica um atraso de um segundo na inicialização usando Thread.sleep(1000).
4. Catch é o bloco que indica erro caso tente realizar o atraso e por algum motivo, não consiga.
5. O método getInstance(String value) permite que qualquer classe acesse a instância única de Singleton.
6. Verificação da instância, caso seja nula, significa que não foi criada.
7. Caso não tenha sido criada, é passado um construtor privado com o valor recebido.
7. O método return irá retornar a instância Singleton, seja a nova ou a que já existia.
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
