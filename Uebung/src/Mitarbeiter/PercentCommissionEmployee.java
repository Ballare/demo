package Mitarbeiter;

public class PercentCommissionEmployee extends Employee {
//Instantzierung
	protected double percentCommission;
	//Konstruktor

	public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, 
			double percentCommission) {
		super(lastname, firstname, department, baseSalary);
		this.percentCommission=percentCommission;
	}
	//Methode
	@Override
	public double getFullSalary(){
		return baseSalary+percentCommission;
	}
	
}
