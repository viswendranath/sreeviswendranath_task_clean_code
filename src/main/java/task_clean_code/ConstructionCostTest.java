package task_clean_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConstructionCostTest {
	@Test
	public void testConstructionCostStandard() {
		assertEquals(1200.00,ConstructionCostCalculator.calculateConstructionCost("standard", 1, false), 0.01);
	}
	
	@Test
	public void testConstructionCostHighStandard() {
		assertEquals(360000.00,ConstructionCostCalculator.calculateConstructionCost("high standard", 200, false), 0.01);
	}
}
