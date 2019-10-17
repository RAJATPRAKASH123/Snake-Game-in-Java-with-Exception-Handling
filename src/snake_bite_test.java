import static org.junit.Assert.*;

import org.junit.Test;


public class snake_bite_test {

	@Test(expected = SnakeBiteException.class)
	public void test() throws SnakeBiteException {
		Snake s = new Snake(5);
		Player p = new Player("Prince");
		s.bite(p);
	}

}
