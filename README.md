# Aufgabe – Taschenrechner (Gruppe A – klassischer Ansatz / test-after)

In dieser Aufgabe implementieren Sie eine Methode, die einfache Rechnungen mit zwei ganzen Zahlen ausführt.  
Sie arbeiten nach dem **test-after-Prinzip**: Zuerst wird die Implementierung geschrieben, dann die Tests.

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

## Vorgehen (test-after)

(1) Implementieren Sie zuerst die Methode MiniCalculator.calculate(int a, int b, char op) in
[Calculator](src/main/java/de/ba/experiment/Calculator.java).

(2) Testen Sie Ihre Implementierung anschließend mit JUnit-Tests:
- Legen Sie Testfälle in [CalculatorTest](src/test/java/CalculatorTest.java) an.
- Testen Sie die vier Grundrechenarten (+, -, *, /) für verschiedene Werte.
- Testen Sie Sonderfälle: Division durch 0 (b = 0) und unbekannte Operatoren.

(3) Führen Sie Ihre Tests regelmäßig aus und ergänzen Sie weitere Testfälle, wenn Sie Fehler finden.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf MiniCalculatorTest → Run 'MiniCalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Verwenden Sie keine KI-Tools (z.B. ChatGPT, Copilot) zur Bearbeitung dieser Aufgabe.
- Halten Sie sich an die vorgegebene Methodensignatur (public static int calculate(int a, int b, char op)).

