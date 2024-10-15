import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook score1;
	GradeBook score2;

	@BeforeEach
	void setUp() throws Exception {
		score1 = new GradeBook(5);
		score2 = new GradeBook(5);
	}

	@AfterEach
	void tearDown() throws Exception {
		score1 = null;
		score2 = null;
	}

	@Test
	void testAddScore() {
		score1.addScore(99.23);
		score1.addScore(15.34);
		score1.addScore(300.22);
		
		String score1Rep = "99.23 15.34 300.22 0.0 0.0 ";
		assertTrue(score1Rep.equals(score1.toString()));
		

		score2.addScore(150.243);
		score2.addScore(59.12);
		score2.addScore(500.233);
		
		String score2Rep = "150.243 59.12 500.233 0.0 0.0 ";
		assertTrue(score2Rep.equals(score2.toString()));
		
		assertEquals(3,score1.getScoreSize());
		assertEquals(3,score2.getScoreSize());

	}
	
	@Test
	void testSum()
	{
		score1.addScore(1000.23);
		score1.addScore(254.32);
		score1.addScore(1212.12);
		
		assertTrue(2466.67 == score1.sum());
		
		score2.addScore(710.23);
		score2.addScore(231.11);
		score2.addScore(5000.46);
		
		assertTrue(5941.8 == score2.sum());
		
	}
	
	@Test
	void testMinimum()
	{
		score1.addScore(12.22);
		score1.addScore(-4245.22);
		score1.addScore(1.1);
		assertTrue(-4245.22 == score1.minimum());
		
		score2.addScore(2.3004);
		score2.addScore(100.86);
		score2.addScore(29.33);
		
		assertTrue(2.3004 == score2.minimum());

	}
	
	@Test
	void testFinal()
	{
		score1.addScore(756.78);
		score1.addScore(104.34);
		score1.addScore(0.0);
		
		assertTrue(861.12 == score1.finalScore());
		
		score2.addScore(-243.23);
		score2.addScore(824.9);
		
		assertTrue(824.9 == score2.finalScore());

	}

}
