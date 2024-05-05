package cloneDory;

public class Cow extends Animal {
	
	public boolean isGestant;
	
	public Cow() {
	}
	
	public Cow(Cow target) {
        super(target);
        if (target != null) {
            this.isGestant = target.isGestant;
        }
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Cow) || !super.equals(object2)) return false;
        Cow shape2 = (Cow) object2;
        return shape2.isGestant == isGestant;
    }

}
