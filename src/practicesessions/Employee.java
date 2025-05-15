package practicesessions;

public class Employee {
	
	private String name;
	private double salary;
	private final double Minimumwage = 15.00;
	
	public Employee (String Laksh, double initialsalary) {
		this.name = Laksh;
		if(initialsalary >= Minimumwage) {
			this.salary = initialsalary;
		}
		else {
			this.salary = Minimumwage;
		}
	}
	
	
	public String getName(){
	return name;
	}
	
	
	public void setSalary( double newsalary) {
		this.salary = newsalary;
	}
	
	
	
	public double getSalary() {
	return salary;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("salary of the employee = " );
		
	}

}
