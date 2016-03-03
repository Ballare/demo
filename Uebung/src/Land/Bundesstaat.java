package Land;

import java.util.ArrayList;

public class Bundesstaat extends Land{

	private ArrayList<Land> land= new ArrayList<>();
	
	//Konstruktor
	public Bundesstaat(double BruttoSozialProdukt, ArrayList<Land>land) {
		super(BruttoSozialProdukt);
		this.land=land;
	}

	public void addLand(Land e){
		land.add(e);
	}	
	@Override
	public double getBruttoSozialProdukt(){
		double sum=0.0;
		for(Land La:land){
			sum+=La.getBruttoSozialProdukt();
		}
		return sum;
	}
		
}
