import static org.junit.Assert.*;

import org.junit.Test;


public class cricket_bite_test {

	@Test
	public void test() throws CricketBiteException {
		Cricket s = new Cricket(5);
		Player p = new Player("Prince");
		s.bite(p);
	}

}
