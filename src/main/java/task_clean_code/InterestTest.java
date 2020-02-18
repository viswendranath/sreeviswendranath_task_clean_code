package task_clean_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterestTest {
	@Test
	public void testCompoundInterest() throws Exception {
		assertEquals(10.0,InterestCalculator.calculateCompoundInterest(100, 1, 10), 0.001);
	}
	@Test
	public void testSimpleInterest() throws Exception {
		assertEquals(10.0,InterestCalculator.calculateSimpleInterest(100, 1, 10), 0.001);
	}
}
