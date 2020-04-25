import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class findMissingLetterTest {

	@Test
    public void exampleTests() {
        assertEquals('e', missingArray.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', missingArray.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
	
}
