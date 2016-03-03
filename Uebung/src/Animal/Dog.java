package Animal;

public class Dog extends Animal{

	protected String name;	
	
	public Dog(String color, int countEyes, String name) {
		super(color, countEyes);
		this.name=name;
	}
	@Override
	public void walk(){
		System.out.println("color "+color+" countEyes "+countEyes+" name "+name+" Dog laeuft");
	}
	@Override
	public void makeNoise(){
		System.out.println("color "+color+" countEyes "+countEyes+" name "+name+" Dog bellt");
	}

}
