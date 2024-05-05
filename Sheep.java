package cloneDory;

public class Sheep extends Animal {

	public boolean wool;
	
	public Sheep() {
	}
	
	public Sheep(Sheep target) {
        super(target);
        if (target != null) {
            this.wool = target.wool;
        }
    }
	
	public Animal clone() {
		return new Sheep(this);
	}
	
	@Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Sheep) || !super.equals(object2)) return false;
        Sheep shape2 = (Sheep) object2;
        return shape2.wool == wool;
    }
}
