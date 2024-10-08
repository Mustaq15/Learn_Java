package Services;

import junit.framework.TestCase;

public class CalculatorServiceTest extends TestCase {

    public void testAddTwoNumbers() {
        assertEquals(5, CalculatorService.addTwoNumbers(2,3));
    }

    public void testSubtractTwoNumbers() {
        assertEquals(2, CalculatorService.subtractTwoNumbers(3, 1));
    }


    public void testProductTwoNumbers() {
        assertEquals(6, CalculatorService.productTwoNumbers(2, 3));
    }

    public void testDivideTwoNumbers() {
        assertEquals(1.5,CalculatorService.divideTwoNumbers(3,2));
    }

    public void testSumAnyNumbers() {
    }
}