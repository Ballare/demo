package Animal;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal Tier=new Animal("",0);
		Frog quaxi=new Frog("green", 2);
		Cat Katze=new Cat("braun",2,"Mieze");
		Dog Hund=new Dog("braun",2 , "Chef");
		Lion Loewe=new Lion("gelb",2);
		
		Animal quaxiAsAnimal=new Frog("green",2);
		Frog Frosch=(Frog)quaxiAsAnimal;
		
		Tier.walk();
		Tier.makeNoise();
		quaxi.walk();
		quaxi.makeNoise();
		Katze.walk();
		Katze.makeNoise();
		Hund.walk();
		Hund.makeNoise();
		Loewe.walk();
		Loewe.makeNoise();
		Loewe.roar();
		quaxiAsAnimal.walk();
		quaxiAsAnimal.makeNoise();
		Frosch.walk();
		Frosch.makeNoise();
		
		Nature Wald=new Nature();
		Wald.addAnimal(Tier);
		Wald.addAnimal(quaxi);
		Wald.addAnimal(Katze);
		Wald.addAnimal(Hund);
		Wald.addAnimal(Loewe);
		Wald.addAnimal(quaxiAsAnimal);
		
		System.out.println("Count Color green "+Wald.countColor("green"));
		
		
		
		
		
		
		
		

	}

}
