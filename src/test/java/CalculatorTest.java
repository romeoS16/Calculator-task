import de.ba.experiment.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void additionOfPositiveNumbers() {
        int result = Calculator.calculate(3, 5, '+');
        assertEquals(8, result);
    }

    // TODO: weitere Testfälle ergänzen

}
