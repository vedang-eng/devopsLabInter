package App;

import static org.junit.Assert.*;

import org.junit.Test;

public class firstTestCase {

	@Test
	public void test() {
		calculaus t=new calculaus();
		int expected = t.addTheSum(20, 40);
		int actual=60;
		assertEquals(expected,actual);
	}
	
	
//	@Test
//	public void test1() {
//		calculaus t=new calculaus();
//		int expected = t.addTheSum(20, 40);
//		int actual=70;
//		assertEquals(expected,actual);
//	}

}
