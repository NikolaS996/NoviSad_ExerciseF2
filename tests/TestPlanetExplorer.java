import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_moving_up_while_N() {
		PlanetExplorer pe = new PlanetExplorer(3, 3);
		
		String expected = "(pos_" + 0 + ",pos_" + 1 +"," + "N" + ")";
		
		assertEquals(expected, pe.executeCommand("f"));
	}
	
	@Test
	public void test_moving_up_while_N_and_while_at_the_edge(){
		PlanetExplorer pe = new PlanetExplorer(3,3);
		
		pe.executeCommand("f");
		pe.executeCommand("f");
		
		String expected = "(pos_" + 0 + ",pos_" + 0 +"," + "N" + ")";
		
		assertEquals(expected, pe.executeCommand("f"));
	}
	
	@Test
	public void test_moving_down_while_N() {
		PlanetExplorer pe = new PlanetExplorer(4, 4);
		
		pe.executeCommand("f");
		
		String expected = "(pos_" + 0 + ",pos_" + 1 +"," + "N" + ")";
		
		assertEquals(expected, pe.executeCommand("f"));
	}
}
