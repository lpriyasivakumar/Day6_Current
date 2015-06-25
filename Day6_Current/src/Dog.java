public class Dog extends Mammal{
	
	public Dog(String name){
		super(name);
	}
	
	

	@Override
	public void speak(){
		System.out.println("Bow...wow");
	}
	
	public void bark(){
		System.out.println("Roof");
	}
}
