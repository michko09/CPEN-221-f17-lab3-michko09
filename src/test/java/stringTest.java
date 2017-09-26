import static org.junit.Assert.*;

import org.junit.Test;

public class stringTest {

	@Test
	public void test1() {
		assertEquals(true, bracketCheck.hasMatchingBrackets("5+6*(3-2.1)+[7-{3/2}]"));
	}

	@Test
	public void test2() {
		assertEquals(false, bracketCheck.hasMatchingBrackets("ab(cd}"));
	}

	@Test
	public void test3() {
		assertEquals(false, bracketCheck.hasMatchingBrackets("ab+(cd*{)"));
	}

	@Test
	public void test4() {
		assertEquals(true, bracketCheck.hasMatchingBrackets("alpha[]({!(+)[]})"));
	}
}