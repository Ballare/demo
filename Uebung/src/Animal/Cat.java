package Animal;

public class Cat extends Animal{
	protected String name;

	public Cat(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public void walk(){
		System.out.println("color "+color+"countEyes "+countEyes+"name "+name+"Cat springt");
	}
	public void makeNoise(){
		System.out.println("color "+color+"countEyes "+countEyes+"name "+name+"Cat miauu");
	}
}
