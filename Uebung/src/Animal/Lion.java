package Animal;

public class Lion extends Animal{

	public Lion(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk(){
		System.out.println("color "+color+" countEyes "+countEyes+" Lion schleicht");
	}
	@Override
	public void makeNoise(){
		System.out.println("color "+color+" countEyes "+countEyes+" Lion Brüllt");
	}
	public void roar(){
		System.out.println("color "+color+ "countEyes "+countEyes+" Lion Gaehnt");
	}
}
