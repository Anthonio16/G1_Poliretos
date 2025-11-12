package pkPoliRetosG1.secuenciasNumericas;

import java.util.Scanner;

public class validacion {
    public  static int validarEntrada() {
        try(Scanner leer = new Scanner(System.in)) {
            int repeticionesInt;
            while (true) {
                System.out.println("Ingrese el numero de repeticiones: ");
                String repeticionesStr  = leer.nextLine();
                if(repeticionesStr.matches("\\d+")) {
                    repeticionesInt = Integer.parseInt(repeticionesStr);
                    if (repeticionesInt > 0)    
                        return repeticionesInt;  
                }
                System.out.println("ERROR: Debe ingresar un numero entero positivo.");
            }
        }
    }
}
