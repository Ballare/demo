package Animal;

public class Animal {

	protected String color;
	protected int countEyes;
	//Konstruktor
	public Animal(String color, int countEyes) {
		this.color = color;
		this.countEyes = countEyes;
	}
	
	public void walk(){
		System.out.println("color "+color+" countEyes "+countEyes);
	}
	public void makeNoise(){
		System.out.println("color "+color+" countEyes "+countEyes);
	}
	
	
}
