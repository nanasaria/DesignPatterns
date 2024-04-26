package factorymethod;

public class ConcreteProductPalio extends Car {
	
	public ConcreteProductPalio() {
		
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
	}

}
