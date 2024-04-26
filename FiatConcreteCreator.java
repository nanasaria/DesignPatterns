package factorymethod;

public class FiatConcreteCreator extends CarCreator {
	
	@Override
	protected Car factoryMethod() {
		return new ConcreteProductPalio();
	}

}
