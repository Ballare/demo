package Land;


public class LandDemo {

	public static void main(String[] args) {
		Bundesland Stmk = new Bundesland(10_000_000.00);
		Bundesland BG = new Bundesland(5_000_000.00);
		Bundesstaat Oe = new Bundesstaat(0.00, null);
		
		System.out.println("Steiermark BruttoSozialProdukt "+Stmk);
		System.out.println("Burgenland BruttoSozialProdukt "+BG);
		
		Oe.addLand(Oe);
		Oe.addLand(BG);
		Oe.addLand(Stmk);
		
		System.out.println("Oesterreich BruttoSozialProdukt "+Oe);
		
		
		

	}

}
