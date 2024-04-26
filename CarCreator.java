package factorymethod;

public abstract class CarCreator {
	
	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();

}
