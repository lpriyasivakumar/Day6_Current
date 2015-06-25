import java.util.ArrayList;

public class AnimalKingdom {

	public static void main(String[] args) {
		System.out.println("Testing Inheritance :)");
		
		Mammal mammal = new Mammal("Generic");
		mammal.speak();
		System.out.printf("Mammal has %d number of legs \n",mammal.numberOfLegs);
		
		Dog d = new Dog("Hey");
		d.setName("Calvin");
		System.out.print(d.getName() + " says ");
		d.speak();
		
		Cat c = new Cat("Hey");		
		c.setName("Garfield");
		System.out.println(c.getName()+ "says");
		c.speak();
		
		String[] names = {"doggy", "lassie", "snoopy","scooby"};
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		for (int i = 0; i < names.length; i++) {
			dogs.add(new Dog(names[i]));
			
		}
		for (String name:names) {
			System.out.println(name);
		}
		for (Dog dog : dogs) {
			System.out.println(dog.getName());
		}
		
	}

}
