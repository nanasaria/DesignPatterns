package singleton;

/*
1. No m�todo main � chamada a getInstance("FOO") e getInstance("BAR").
2. Os m�todos getInstance() s�o chamados na mesma thread.
3. Singleton e anotherSingleton apontam para a mesma inst�ncia de Singleton. N�o h� concorr�ncia entre eles.
4. H� um atraso de 1 segundo no construtor de Singleton (Thread.sleep(1000)).
Por causa disso, o valor impresso � "FOO" para ambas, pois a inicializa��o lenta s� ocorre uma vez na primeira 
chamada de getInstance().
*/

public class DemoSingleThread {
	public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
