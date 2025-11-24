# Aufgabe – Taschenrechner (Gruppe B – TDD, keine KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** an einem kleinen Taschenrechner.  
Sie schreiben zuerst Tests und entwickeln dann Schritt für Schritt die Implementierung.  

---

## Aufgabe

Implementieren Sie in der Klasse [Calculator](src/main/java/de/ba/experiment/Calculator.java) die Methode

```java
public static int calculate(int a, int b, char op){}  
```

Die Methode soll abhängig vom Operator op folgendes Verhalten haben:
- '+' → a + b
- '-' → a - b
- '*' → a * b
- '/' → a / b (Ganzzahldivision)

Sonderfälle:
- Wenn op nicht '+', '-', '*' oder '/' ist, soll 0 zurückgegeben werden.
- Wenn op == '/' und b == 0 ist, soll ebenfalls 0 zurückgegeben werden.  

Schreiben Sie Tests in der [CalculatorTest](src/test/java/CalculatorTest.java) Klasse.

---

## Vorgehen (TDD: Red – Green – Refactor)

Arbeiten Sie in kleinen TDD-Schritten:

(1) **Red** – Test schreiben
- Formulieren Sie zunächst in MiniCalculatorTest einen Testfall für einen einfachen Fall, z.B.
calculate(3, 5, '+') → 8.
- Führen Sie die Tests aus – der neue Test sollte zunächst fehlschlagen.

(2) **Green** – minimaler Code
- Implementieren Sie MiniCalculator.calculate(...) so, dass der Test besteht.
- Schreiben Sie zunächst nur so viel Code wie nötig, um den Test grün zu bekommen.

(3) **Refactor** – aufräumen
- Verbessern Sie bei Bedarf den Code (z.B. klarere if/else-Struktur),
ohne das Verhalten zu ändern. Alle Tests müssen grün bleiben.

(4) Weitere Tests hinzufügen
- Ergänzen Sie weitere Testfälle   

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf MiniCalculatorTest → Run 'MiniCalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static int calculate(int a, int b, char op)).
- Schreiben Sie konsequent Tests zuerst und lassen Sie sich von ihnen durch die Implementierung führen.