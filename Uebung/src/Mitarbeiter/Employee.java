package Mitarbeiter;

public class Employee {
//Instanzierung
	protected String lastname;
	protected String firstname;
	protected String department;
	protected double baseSalary;
	
	//Konstruktor
	public Employee(String lastname, String firstname, String department, double baseSalary) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.department = department;
		this.baseSalary = baseSalary;
	}
	//Getter Setter
	public double getFullSalary(){
		return baseSalary;
	}
	
	
}
