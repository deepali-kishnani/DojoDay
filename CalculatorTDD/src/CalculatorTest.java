import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int x = 10;
        int y = 5;
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.add(x, y));


    }


}
