package singleton;

/*
1. No método main é chamada a getInstance("FOO") e getInstance("BAR").
2. Os métodos getInstance() são chamados na mesma thread.
3. Singleton e anotherSingleton apontam para a mesma instância de Singleton. Não há concorrência entre eles.
4. Há um atraso de 1 segundo no construtor de Singleton (Thread.sleep(1000)).
Por causa disso, o valor impresso é "FOO" para ambas, pois a inicialização lenta só ocorre uma vez na primeira 
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
