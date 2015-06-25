
public class Mammal extends Animal {
	
	public Mammal(String name){
		super(name);
		this.numberOfLegs = 4;
	}
	
	@Override
	public void speak(){
		System.out.println("I need to know what I am before I can speak!!!");
	}
}
