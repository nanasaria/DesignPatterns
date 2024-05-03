<h1>Factory Method</h1>

<br>
<img height="250" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Factory_Method_UML_class_diagram.png/400px-Factory_Method_UML_class_diagram.png" align="center" />

<p><b>Classe Car</b> é onde se define o modelo, marca e a categoria do carro, ou seja, seus atributos principais. Essa classe é onde acontece o encapsulamento da criação de objetos.</p>
<p><b>Classe CarCreator</b> é a classe base onde se define um método fábrica, nesse caso o buildCar(). </p>
<p><b>Classe Client</b> com método main onde se executa as construções.</p>
<p><b>Classe ConcreteProductGol</b> é uma subclasse que extende da classe carro, é onde se cria o objeto “Gol”. Essa classe é onde acontece o polimorfismo construindo o objeto de acordo com a classe que se extende.</p>
<p><b>Classe ConcreteProductPalio</b> é uma subclasse que extende da classe carro, é onde se cria o objeto “Palio”. Essa classe é onde acontece o polimorfismo construindo o objeto de acordo com a classe que se extende.</p>
<p><b>Classe FiatConcreteProduct</b> é uma subclasse que extende da classe carro, é onde se cria o objeto “Fiat”. Subclasse que instancia a classe CarCreator e retorna o ConcreteProductPalio.</p>
<p><b>Classe VolksConcreteProduct</b> é uma subclasse que extende da classe carro, é onde se cria o objeto “Volks”. Subclasse que instancia a classe CarCreator e retorna o ConcreteProductGol.</p>

<br>
