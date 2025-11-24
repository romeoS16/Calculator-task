import de.ba.experiment.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Bevor Sie eine KI um Hilfe bitten (siehe README und ki-log.md).

    @Test
    public void additionOfPositiveNumbers() {
        int result = Calculator.calculate(3, 5, '+');
        assertEquals(8, result);
    }

    // TODO: weitere Testfälle ergänzen

}
