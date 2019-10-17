import static org.junit.Assert.*;

import org.junit.Test;


public class trampoline_exception {

	@Test
	public void test() throws TrampolineException {
		Trampoline s = new Trampoline(5);
		Player p = new Player("Prince");
		s.bite(p);
	}

}
