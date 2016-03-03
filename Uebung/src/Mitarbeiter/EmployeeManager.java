package Mitarbeiter;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeManager {

	//Instantzierung
	ArrayList<Employee>employee=new ArrayList<>();
  
	//Konstruktor
	public EmployeeManager(){
		employee=new ArrayList<>();
	}
	//Methoden
	public double calcTotalSalary(){
	double sum=0.00;
	for(Employee Angestellter:employee){
		sum+=Angestellter.getFullSalary();
	}
	return sum;
}
 public void addEmployee(Employee e){
	employee.add(e);
 }
 //Methode
  public HashMap<String, Double>getSalaryByDepartmen(){
	  	HashMap<String, Double>byDepartment = new HashMap<>();
	  	double Abteilung=0;
	  	
	  	for(Employee Ang:employee){
	  		if(byDepartment.containsKey(Ang.department)){
	  			Abteilung=byDepartment.get(Ang.department);
	  			byDepartment.put(Ang.department, Ang.getFullSalary()+Abteilung);
	  		}
	  		else{
	  			byDepartment.put(Ang.department, Ang.getFullSalary());
	  		}
	  		return byDepartment;
	  	}
		return byDepartment;
 
 
	}
}

