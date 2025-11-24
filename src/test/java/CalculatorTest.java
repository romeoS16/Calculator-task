import de.ba.experiment.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void additionOfPositiveNumbers() {
        int result = Calculator.calculate(3, 5, '+');
        assertEquals(8, result);
    }

    // TODO: weitere Testfälle ergänzen

}
