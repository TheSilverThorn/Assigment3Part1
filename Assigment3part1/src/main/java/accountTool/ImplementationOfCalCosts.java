package accountTool;

public class ImplementationOfCalCosts implements CalculateCosts {
	
	CalculateCosts object;

	public int computeTax(int amount) {
		
		return object.computeTax(amount);
	}

	public int weeklySalary(Employee emp) {
		
		return object.weeklySalary(emp);
	}

	public int fortnightSalary(Employee emp) {

		return object.fortnightSalary(emp);
	}

	public double computeKiwiSaver(Employee emp) {

		return object.fortnightSalary(emp);
	}

}
