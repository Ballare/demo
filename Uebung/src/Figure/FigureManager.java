package Figure;
import java.util.ArrayList;
import java.util.HashMap;
public class FigureManager {

ArrayList<Figure> manager= new ArrayList<>();

	//Konstruktor
	public FigureManager(){
		manager=new ArrayList<>();
	}
	public void add(Figure f){
		manager.add(f);
	}
	public double getMaxPerimeter(){
		double Umfang=0.00;
		for(Figure U:manager){
			double perimeter=U.getPerimeter();
			if(perimeter < Umfang)
				Umfang=perimeter;
		}
		return Umfang;
		
	}
	public double getAverageAreaSize(){
		double Area=0.00;
		for(Figure A:manager){
			Area+=A.getArea();
		}
		return Area/manager.size();
	}
	
	public HashMap<String, Double> getAreaBySizeCategories(){
		
	HashMap<String, Double>Flaechen =new HashMap<>();
	
	Flaechen.put("Klein", 0.00);
	Flaechen.put("Mittel", 0.00);
	Flaechen.put("Groﬂ",0.00);
	
	for(Figure A:manager){
		double Area=A.getArea();
		
		if(Area <1381.00){
			Flaechen.put("Klein", Flaechen.get("Klein")+Area);
			}
		else if(Area <7870.00){
			Flaechen.put("Mittel", Flaechen.get("Mittel")+Area);
		}
		else{
			Flaechen.put("Groﬂ",Flaechen.get("Groﬂ")+Area);
		}
	}
	return Flaechen;
	}
	
	

}
