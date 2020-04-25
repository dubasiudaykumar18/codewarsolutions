import org.junit.Test;

import static org.junit.Assert.*;

public class orderedHighestNumTest {
	 @Test
	    public void test_01() {
	        assertEquals(0, orderedHighestNumber.sortDesc(0));
	    }

	    @Test
	    public void test_02() {
	        assertEquals(51, orderedHighestNumber.sortDesc(15));
	    }


	    @Test
	    public void test_03() {
	        assertEquals(987654321, orderedHighestNumber.sortDesc(123456789));
	    }

	    @Test
	    public void testWithRepeatedNums() {
	        assertEquals(987655321, orderedHighestNumber.sortDesc(123567859));
	    }

}
