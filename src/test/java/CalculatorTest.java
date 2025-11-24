import de.ba.experiment.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void additionOfPositiveNumbers() {
        int result = Calculator.calculate(3, 5, '+');
        assertEquals(8, result);
    }

    @Test
    public void additionWithNegativeNumber() {
        int result = Calculator.calculate(-2, 5, '+');
        assertEquals(3, result);
    }

    @Test
    public void subtractionOfPositiveNumbers() {
        int result = Calculator.calculate(10, 4, '-');
        assertEquals(6, result);
    }

    @Test
    public void subtractionWithNegativeResult() {
        int result = Calculator.calculate(4, 10, '-');
        assertEquals(-6, result);
    }

    @Test
    public void multiplicationOfPositiveNumbers() {
        int result = Calculator.calculate(2, 3, '*');
        assertEquals(6, result);
    }

    @Test
    public void multiplicationWithZero() {
        int result = Calculator.calculate(7, 0, '*');
        assertEquals(0, result);
    }

    @Test
    public void divisionOfPositiveNumbers() {
        int result = Calculator.calculate(8, 2, '/');
        assertEquals(4, result);
    }

    @Test
    public void divisionWithNegativeNumbers() {
        int result = Calculator.calculate(-9, 3, '/');
        assertEquals(-3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divisionByZeroThrowsIllegalArgumentException() {
        Calculator.calculate(8, 0, '/');
    }

    @Test(expected = IllegalArgumentException.class)
    public void unknownOperatorThrowsIllegalArgumentException() {
        Calculator.calculate(3, 5, '?');
    }

//    Ohne Exception
//    @Test
//    public void divisionByZeroReturnsZero() {
//        int result = Calculator.calculate(8, 0, '/');
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void unknownOperatorReturnsZero() {
//        int result = Calculator.calculate(3, 5, '?');
//        assertEquals(0, result);
//    }

}
