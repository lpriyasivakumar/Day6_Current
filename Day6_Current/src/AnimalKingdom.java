
public class AnimalKingdom {

	public static void main(String[] args) {
		System.out.println("Testing Inheritance :)");
		
		Mammal mammal = new Mammal();
		mammal.speak();
		System.out.printf("Mammal has %d number of legs \n",mammal.numberOfLegs);
		
		Dog d = new Dog();
		d.setName("Calvin");
		System.out.print(d.getName() + " says ");
		d.speak();
		
		Cat c = new Cat();		
		c.setName("Garfield");
		System.out.println(c.getName()+ "says");
		c.speak();
	}

}
