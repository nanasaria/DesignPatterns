package factorymethod;

public class VolksConcreteCreator extends CarCreator{
	
	protected Car factoryMethod() {
		return new ConcreteProductGol();
	}
	
}
