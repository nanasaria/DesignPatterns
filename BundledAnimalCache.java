package cloneDory;

import java.util.HashMap;
import java.util.Map;

public class BundledAnimalCache {
	private Map<String, Animal> cache = new HashMap<>();
	
	public BundledAnimalCache() {
        Sheep sheep = new Sheep();
        sheep.wool = true;
        sheep.color = "White";

        Cow cow = new Cow();
        cow.isGestant = false;
        cow.color = "Black and White";

        cache.put("Dolly White (Sheep)", sheep);
        cache.put("clone Cow Black and White", cow);
    }

    public Animal put(String key, Animal animal) {
        cache.put(key, animal);
        return animal;
    }

    public Animal get(String key) {
        return cache.get(key).clone();
    }
}
