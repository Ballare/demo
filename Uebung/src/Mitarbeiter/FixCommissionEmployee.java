package Mitarbeiter;

public class FixCommissionEmployee extends Employee{
//Instanzierung
	protected double additionalCommission;
	//Konstruktor
	public FixCommissionEmployee(String lastname, String firstname, 
			String department, double baseSalary, double additionalCommission) {
		super(lastname, firstname, department, baseSalary);
	this.additionalCommission=additionalCommission;
	}
	
	@Override
	public double getFullSalary(){
		return baseSalary+additionalCommission;
	}
	
	
	
	
}
