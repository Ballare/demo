package Mitarbeiter;

public class MitarbeiterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp= new Employee("Sorglos", "Susi", "Buchhaltung", 1100.00);
		FixCommissionEmployee Fix=new FixCommissionEmployee("Hammer","Gert", "Verkäufer", 1450.00, 100.00);
		PercentCommissionEmployee Per=new PercentCommissionEmployee("Schein", "Lui", "Verkäufer", 1450.00, 290.00);
		EmployeeManager Mani = new EmployeeManager();
		
		Mani.addEmployee(Emp);
		Mani.addEmployee(Fix);
		Mani.addEmployee(Per);
		
		System.out.println("Grundgehalt "+Emp.getFullSalary());
		System.out.println("Grundgehalt und Provision "+Fix.getFullSalary());
		System.out.println("Grundgehalt und Provision in Prozent "+Per.getFullSalary());
		
		System.out.println("Gesamtgehalt aller Mitarbeiter "+Mani.calcTotalSalary());
		System.out.println("Gesamtgehalt pro Abteilung "+Mani.getSalaryByDepartmen());
		
		
		
	}

}
