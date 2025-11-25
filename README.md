# Aufgabe – Taschenrechner (Gruppe C – TDD + KI)

In dieser Aufgabe üben Sie **Test-Driven Development (TDD)** und dürfen zusätzlich eine KI
(z.B. ChatGPT) unter klar definierten Bedingungen verwenden.  

---

## Aufgabe

Implementieren Sie in der Klasse [Calculator](src/main/java/de/ba/experiment/Calculator.java) die Methode

```java
public static int calculate(int a, int b, char op) {}
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

Grundsätzlich arbeiten Sie wie in Gruppe B:

(1) **Red** – Test schreiben
- Schreiben Sie zuerst eigene Testfälle in CalculatorTest

(2) **Green** – minimaler Code
- Implementieren Sie Calculator.calculate(...) so, dass Ihre Tests grün werden.

(3) **Refactor** – aufräumen
- Verbessern Sie Code und evtl. Tests, ohne das Verhalten zu ändern.

(4) Ergänzen Sie nach und nach weitere Tests

---

## Nutzung von KI

Sie dürfen eine KI (z.B. ChatGPT) zur Unterstützung einsetzen – aber nur nach bestimmten Regeln:

(1) Wofür Sie KI verwenden dürfen
- Vorschläge für weitere Testfälle (z.B. Sonderfälle)
- Ideen für eine saubere if/else- oder switch-Struktur
- Refactoring-Vorschläge (z.B. Dopplungen vermeiden)

(2) KI-Log führen ([ki-log.md](ki-log.md)
- Jede KI-Nutzung dokumentieren:
  - Datum/Uhrzeit
  - verwendeter Prompt
  - kurz: Was wurde übernommen? (z.B. „Testfall für Division durch 0“, „Alternative switch-Lösung“)  
  - In der ([ki-log.md](ki-log.md) Datei befindet sich ein Beispiel

(4) Wichtig:
- Sie sind verantwortlich, die KI-Vorschläge kritisch zu prüfen und ggf. anzupassen.
- Das spätere Quiz zur Einheit wird ohne KI bearbeitet.  

---

**Technische Hinweise**
- Projekt-Typ: Maven, Java (z.B. JDK 17), JUnit 5.
- Tests ausführen:
  - In IntelliJ: Rechtsklick auf CalculatorTest → Run 'CalculatorTest'
  - Über die Konsole: mvn test

**Rahmenbedingungen**
- Halten Sie sich an die vorgegebene Methodensignatur (public static int calculate(int a, int b, char op)).
- Dokumentieren Sie jede KI-Nutzung vollständig in ki-log.md.
- Arbeiten Sie weiterhin im Sinne von TDD: Tests geben den Takt vor, nicht die KI.