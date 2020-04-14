package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double netSalary(){
		return GrossSalary - Tax;
		
	}
	public void increaseSalary(double percent){
		GrossSalary = GrossSalary+(GrossSalary*percent)/100;
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f", netSalary());
	}
}
