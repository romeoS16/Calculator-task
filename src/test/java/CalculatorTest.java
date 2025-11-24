import de.ba.experiment.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // In dieser Gruppe nutzen Sie das test-after-Prinzip:
    // 1. Implementieren Sie zuerst MiniCalculator.calculate(int a, int b, char op).
    // 2. Schreiben Sie danach eigene Tests für typische Fälle und Sonderfälle.

    @Test
    public void additionOfPositiveNumbers() {
        int result = Calculator.calculate(3, 5, '+');
        assertEquals(8, result);
    }

    // TODO: weitere Testfälle ergänzen

}
