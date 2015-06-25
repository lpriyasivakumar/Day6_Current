
public abstract class Animal {
	private String name;
	public int numberOfLegs;
	
	public Animal(String s){
		name = s;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void speak();
}
