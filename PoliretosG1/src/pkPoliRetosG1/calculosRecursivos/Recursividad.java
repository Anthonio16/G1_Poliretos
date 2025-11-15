package pkPoliRetosG1.calculosRecursivos;

import java.util.Scanner;


public class Recursividad {

    public Recursividad() {
        
    }

    public static void inicializarCalculos() {

        System.out.println("-----------EJERCICIOS CÁLCULOS (CON BUCLES)--------------");
        Scanner scanner = new Scanner(System.in);

        // --- Ejercicio C01: Conteo Progresivo ---
        System.out.println("\nC01) Conteo progresivo (1 hasta n)");
        System.out.print("-> Ingrese el numero (n) para el conteo progresivo: ");
        int nProgresivo = scanner.nextInt();
        
       
        Conteo.progresivoFor(nProgresivo);
        Conteo.progresivoWhile(nProgresivo);
        Conteo.progresivoDoWhile(nProgresivo);

        // --- Ejercicio C02: Conteo Regresivo ---
        System.out.println("\nC02) Conteo regresivo (n hasta 0)");
        System.out.print("-> Ingrese el numero (n) para el conteo regresivo: ");
        int nRegresivo = scanner.nextInt();

       
        Conteo.regresivoFor(nRegresivo);
        Conteo.regresivoWhile(nRegresivo);
        Conteo.regresivoDoWhile(nRegresivo);

        
        System.out.println("\nC03) Calcular factorial (n!)");
        System.out.print("-> Ingrese el numero (n): ");
        int nFact = scanner.nextInt();

        
        System.out.println("Resultado (for): " + Factorial.conFor(nFact));
        System.out.println("Resultado (while): " + Factorial.conWhile(nFact));
        System.out.println("Resultado (do-while): " + Factorial.conDoWhile(nFact));

        
        System.out.println("\nC04) Multiplicacion (a * b) por sumas sucesivas");
        System.out.print("-> Ingrese 'a': ");
        int aMulti = scanner.nextInt();
        System.out.print("-> Ingrese 'b': ");
        int bMulti = scanner.nextInt();

        System.out.println("Resultado (for): " + Multiplicacion.conFor(aMulti, bMulti));
        System.out.println("Resultado (while): " + Multiplicacion.conWhile(aMulti, bMulti));
        System.out.println("Resultado (do-while): " + Multiplicacion.conDoWhile(aMulti, bMulti));

        
        System.out.println("\nC05) Potencia (a ^ b) por multiplicaciones sucesivas");
        System.out.print("-> Ingrese la base 'a': ");
        int aPot = scanner.nextInt();
        System.out.print("-> Ingrese el exponente 'b': ");
        int bPot = scanner.nextInt();

        System.out.println("Resultado (for): " + Potencia.conFor(aPot, bPot));
        System.out.println("Resultado (while): " + Potencia.conWhile(aPot, bPot));
        System.out.println("Resultado (do-while): " + Potencia.conDoWhile(aPot, bPot));

        
        System.out.println("\nC06) Suma (a + b) por incrementos");
        System.out.print("-> Ingrese 'a': ");
        int aSuma = scanner.nextInt();
        System.out.print("-> Ingrese 'b': ");
        int bSuma = scanner.nextInt();

        System.out.println("Resultado (for): " + Suma.conFor(aSuma, bSuma));
        System.out.println("Resultado (while): " + Suma.conWhile(aSuma, bSuma));
        System.out.println("Resultado (do-while): " + Suma.conDoWhile(aSuma, bSuma));

        scanner.close();
    }
}