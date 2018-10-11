package accountTool;

public interface CalculateCosts 
{	
	public int computeTax(int amount);
	public int	weeklySalary(Employee emp); 
	public int	fortnightSalary(Employee emp); 
	public double computeKiwiSaver(Employee emp); 
}
