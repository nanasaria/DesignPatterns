package cloneDory;

public class Demo {
	public static void main(String[] args) {
        BundledAnimalCache cache = new BundledAnimalCache();

        Animal animal1 = cache.get("Dolly White (Sheep)");
        Animal animal2 = cache.get("clone Cow Black and White");
        Animal animal3 = cache.get("clone Cow Black and White");

        if (animal1 != animal2 && !animal1.equals(animal2)) {
            System.out.println("Dolly White (Sheep) != clone Cow Black and White");
        } else {
            System.out.println("Big dolly black == clone Cow Black and White");
        }

        if (animal2 != animal3) {
            System.out.println("clone Cow Black and White are two different objects");
            if (animal2.equals(animal3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Cows are the same (booo!)");
        }
    }

}
