import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test_Frame_Score(){
		Frame f = new Frame(3, 4);
		
		assertEquals("Greska ako nije dobijen ocekivan zbir", 7, f.score());
	}
}
