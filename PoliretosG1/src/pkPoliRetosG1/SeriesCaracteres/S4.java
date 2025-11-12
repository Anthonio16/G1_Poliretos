package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S4 {
    public static void secuencia4() {

        int repeticiones = validacion.validarEntrada();

        System.out.println("Bucle For");
        String secuenciaRepetir = "+ - *", secuencia = "";
        for (int i = 1; i <= repeticiones; i++) {
            secuencia += secuenciaRepetir + " / ";
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        secuencia = "";
        int i = 1;
        while (i <= repeticiones) {
            secuencia += secuenciaRepetir + " / ";
            i++;
        }
        System.out.println(secuencia);

        System.out.println("Bucle do while");
        secuencia = "";
        i = 1;
        do {
            secuencia += secuenciaRepetir + " / ";
            i++;
        } while (i <= repeticiones);
        System.out.println(secuencia);

    }
}
