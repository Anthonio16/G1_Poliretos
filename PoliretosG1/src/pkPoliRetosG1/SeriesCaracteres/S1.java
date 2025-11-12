package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S1 {
    public static void main(String[] args) {
        int repeticiones;
        repeticiones = validacion.validarEntrada();
        System.out.println("Bucle For");
        String secuencia = "";
        for (int i = 1; i <= repeticiones; i++) {
            if (i % 2 == 0) {
                secuencia += " - ";
            } else {
                secuencia += " + ";
            }
        }
        System.out.println(secuencia);

        System.out.println("Bucle While");
        secuencia = "";
        int i = 1;
        while (i <= repeticiones) {
            if (i % 2 == 0) {
                secuencia += " - ";
            } else {
                secuencia += " + ";
            }
            i++;
        }
        System.out.println(secuencia);

        System.out.println("Bucle Do While");
        secuencia = "";
        i = 1;
        do {
            if (i % 2 == 0) {
                secuencia += " - ";
            } else {
                secuencia += " + ";
            }
            i++;
        } while (i <= repeticiones);
        System.out.println(secuencia);
    }
}
