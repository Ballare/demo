package Animal;
import java.util.ArrayList;

public class Nature {
	
ArrayList<Animal>animal=new ArrayList<>();

public void addAnimal(Animal a){
	animal.add(a);
}
public int countColor(String color){
	int count=0;
	for(Animal Pet:animal){
		if(Pet.color.equals(color))
			count++;
	}
	return count;
}
	

}
