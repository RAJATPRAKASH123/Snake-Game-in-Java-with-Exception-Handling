import static org.junit.Assert.*;

import org.junit.Test;


public class vulture_bite_test {

	@Test
	public void test() throws VultureBiteException {
		Vulture s = new Vulture(5);
		Player p = new Player("Prince");
		s.bite(p);
	}

}
