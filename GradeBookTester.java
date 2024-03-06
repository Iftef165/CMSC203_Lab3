package labWork2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook test1;
	
	GradeBook test2;

	@BeforeEach
	void setUp() throws Exception {
		test1 = new GradeBook(5);
		
		test1.addScore(20.4);
		test1.addScore(10.3);
		
		test2 = new GradeBook(5);
		
		test2.addScore(40);
		test2.addScore(10);
		test2.addScore(60);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		test1 = null;
	}

	@Test
	void test() {
		
		assertTrue(test1.toString().equals("20.4 10.3 0.0 0.0 0.0"));
		assertEquals(test1.sum(), 30.7);
		assertEquals(test1.minimum(), 10.3);
		assertEquals(test1.finalScore(), 20.4);
	}
	
	@Test
	void test1() {
		assertTrue(test2.toString().equals("40.0 10.0 60.0 0.0 0.0"));
		assertEquals(test2.sum(), 110);
		assertEquals(test2.minimum(), 10);
		assertEquals(test2.finalScore(), 100);

		

	}
	

}
