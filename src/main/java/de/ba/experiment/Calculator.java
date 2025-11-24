package de.ba.experiment;

public class Calculator {

    /**
     * Führt eine einfache Rechnung mit zwei ganzen Zahlen aus.
     *
     * Der Parameter op gibt die Operation an:
     *  '+' -> a + b
     *  '-' -> a - b
     *  '*' -> a * b
     *  '/' -> a / b   (Ganzzahldivision)
     *
     * Für Division durch 0 oder einen unbekannten Operator
     * soll ein sinnvolles Verhalten definiert werden
     * (z.B. Rückgabe von 0 oder später Exception).
     */

    public static int calculate(int a, int b, char op) {

         switch (op) {
             case '+' -> {
                 return a + b;
             }
             case '-' -> {
                 return a - b;
             }
             case '*' -> {
                 return a * b;
             }
             case '/' -> {
                if (b == 0){
                    //Ohne Exception
                    //return 0;
                    throw new IllegalArgumentException("you cant divide by zero");
                }
                return  a / b;
            }
            default ->
                    //Ohne Exception
                    //return 0;
                    throw new IllegalArgumentException("wrong operator");
        }
    }
}
