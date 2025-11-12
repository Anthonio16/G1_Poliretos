
package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class validacion {
    private static final Scanner leer = new Scanner(System.in);

    public static int validarEntrada() {
        int repeticionesInt;
        while (true) {
            System.out.print("Ingrese el número de repeticiones: ");
            String repeticionesStr = leer.nextLine();

            if (repeticionesStr.matches("\\d+")) {
                repeticionesInt = Integer.parseInt(repeticionesStr);
                if (repeticionesInt > 0)
                    break;
            }

            System.out.println("ERROR: Debe ingresar un número entero positivo.");
        }
        return repeticionesInt;
    }
}