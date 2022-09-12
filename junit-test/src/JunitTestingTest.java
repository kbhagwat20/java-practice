import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestingTest {
	
	JunitTesting test = new JunitTesting();
	

	@Test
	void testSquare() {
		
		int o1 = test.square(4);
		assertEquals(16, o1);
		
	}
	
	@Test
	void testCountA() {
		
		int o2 = test.countA("Java");
		assertEquals(2, o2);
		
	}
	

}
