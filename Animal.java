package cloneDory;

import java.util.Objects;

public abstract class Animal {
	
	 public String especie;
	 public String color;

	    public Animal() {
	    }

	    public Animal(Animal target) {
	        if (target != null) {
	            this.especie = target.especie;
	            this.color = target.color;
	        }
	    }

	    public abstract Animal clone();

	    @Override
	    public boolean equals(Object object2) {
	        if (!(object2 instanceof Animal)) return false;
	        Animal shape2 = (Animal) object2;
	        return shape2.especie == especie && Objects.equals(shape2.color, color);
	    }

}
