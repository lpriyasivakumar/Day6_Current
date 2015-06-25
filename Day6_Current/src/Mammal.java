
public class Mammal extends Animal {
	
	public Mammal(){
		this.numberOfLegs = 4;
	}
	
	@Override
	public void speak(){
		System.out.println("I need to know what I am before I can speak!!!");
	}
}
