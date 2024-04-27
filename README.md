<h1>Factory Method</h1>

<p><b>Classe Car</b> é onde se define o modelo, marca e a categoria do carro, ou seja, seus atributos principais. Essa classe é onde acontece o encapsulamento da criação de objetos.</p>

<p>Classe CarCreator é a classe base onde se define um método fábrica, nesse caso o buildCar(). </p>
<p>Classe Client com método main onde se executa as construções.</h3>
<h3>Classe ConcreteProduct Gol é uma subclasse que extende da classe carro, é onde se cria o objeto “Gol”. Essa classe é onde acontece o polimorfismo construindo o objeto de acordo com a classe que se extende.</h3>
<h3>Classe ConcreteProduct Palio é uma subclasse que extende da classe carro, é onde se cria o objeto “Palio”. Essa classe é onde acontece o polimorfismo construindo o objeto de acordo com a classe que se extende.</h3>
<h3>Classe FiatConcreteProduct é uma subclasse que extende da classe carro, é onde se cria o objeto “Fiat”. Subclasse que instancia a classe CarCreator e retorna o ConcreteProductPalio.</h3>
<h3>Classe VolksConcreteProduct  é uma subclasse que extende da classe carro, é onde se cria o objeto “Volks”. Subclasse que instancia a classe CarCreator e retorna o ConcreteProductGol.</h3>
