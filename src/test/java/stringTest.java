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
	
	@Test
	public void test5() {
		assertEquals(false, bracketCheck.hasMatchingBrackets("()()()()()()()()[][]{]"));
	}
	
	@Test
	public void test6() {
		assertEquals(true, bracketCheck.hasMatchingBrackets("{{[]}()()([])}"));		
	}
	
	@Test
	public void test7() {
		assertEquals(true, bracketCheck.hasMatchingBrackets("     ........   ().....     []......"));
	}
	
	@Test
	public void test8() {
		assertEquals(true, bracketCheck.hasMatchingBrackets("\t\n\n\n{}\n\n\n{}"));
	}
}