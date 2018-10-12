package accountTool;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class ImplementationOfCalCostsTest {
	
	ImplementationOfCalCosts implementationOfCalCosts;	
	CalculateCosts calculateCosts;
	int amount;
	Employee emp;
	

	@Before
	public void setUp() throws Exception 
	{		
		implementationOfCalCosts = new ImplementationOfCalCosts();		
		amount = 1337;
		emp = new Employee();
		
		calculateCosts = Mockito.mock(CalculateCosts.class);
		Mockito.when(calculateCosts.computeTax(amount)).thenReturn(1337);
		Mockito.when(calculateCosts.weeklySalary(emp)).thenReturn(1337);
		Mockito.when(calculateCosts.fortnightSalary(emp)).thenReturn(1337);
		Mockito.when(calculateCosts.computeKiwiSaver(emp)).thenReturn(1337.420);
		
		implementationOfCalCosts.setObject(calculateCosts);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testComputeTax() {
		assertEquals(amount, implementationOfCalCosts.computeTax(amount));
	}
	
	@Test
	public void weeklySalary() {
		assertEquals(amount, implementationOfCalCosts.weeklySalary(emp));
	}
	
	@Test
	public void testfortnightSalary() {
		assertEquals(amount, implementationOfCalCosts.fortnightSalary(emp));
	}
	
	@Test
	public void computeKiwiSaver() {
		assertEquals(1337.420, implementationOfCalCosts.computeKiwiSaver(emp), 0.5);
	}
}
