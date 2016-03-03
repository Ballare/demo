package Land;

public class Bundesland extends Land {

	
	public Bundesland(double BruttoSozialProdukt) {
		super(BruttoSozialProdukt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBruttoSozialProdukt(){
		return BruttoSozialProdukt;
	}

}
