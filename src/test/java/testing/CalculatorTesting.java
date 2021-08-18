package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTesting {
	
	calculator calc;

	@BeforeEach
	void init() {
		calc = new calculator();
	}

	@Test
	void testAdd() {
		int result = calc.add(4, 5);// act
		assertEquals(9, result, "test failed");
	}

	@Test
	void testAddFloat() {
		float result = calc.add(1.7f, 5.3f);// act
		assertEquals(7f, result, 0.200002);
	}
	@Test
	void testAddFloatGreaterThanTwo() {
		float result = calc.add(3f, 5.3f);// act
		assertEquals(10.2f, result, 0.200002);
	}

	@Test
	void testFirtsInputParameterIsSmall() {
		float result = calc.divide(3, 5);// act
		assertEquals(0.0f, result, "failed because first parameter is biggere then second one");
	}

	@Test
	void AddOneNegative() {
		int result = calc.add(-4, 5);// act
		assertEquals(9, result, "test failed becuse one of the number is negative");
	}

	@Test
	void AddBothNegative() {
		int result = calc.add(-4, -5);// act
		assertEquals(9, result, "test failed because both are negative");
	}
	
	@Test
	void CheckIfDenominatorIsZero() {
		try {
			calc.divide(6, 2);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass(), "test");
		}

	}
}
