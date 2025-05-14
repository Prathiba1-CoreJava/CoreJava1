package exceptionhandling;

public class Employeesalarycalculator {

	
	public double calculateannualsalary(double monthlysalary) throws Invalidsalaryexception {
		if (monthlysalary <=0) {
			throw new Invalidsalaryexception("Salary must be greater than 0.");
		}
		
		double totalannualsalary = 0;
		
		for(int month =1; month <=12; month++) {
			totalannualsalary += monthlysalary;
			monthlysalary += monthlysalary * 0.05;
		}
		return totalannualsalary;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Employeesalarycalculator calculator = new Employeesalarycalculator();
			double initialsalary = 3000.00;
			double annualsalary = calculator.calculateannualsalary(initialsalary);
			System.out.println("Annual salary with 5% increment: " + annualsalary);
		}
		catch(Invalidsalaryexception e) {
			System.out.println("error: " +e.getMessage());
		}
		}
		
		
	}


