package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S2 {
    public static void main(String[] args) {
        int repeticiones, a = 0, b = 1, c, i = 1;
        repeticiones = validacion.validarEntrada();
        System.out.println("Bucle For");
        String secuencia = "";
        for (i = 1; i <= repeticiones; i++) {
            if (i == 1) {
                secuencia += "+ ";
            }
            c = a + b;
            a = b;
            b = c;
            secuencia += "+".repeat(c) + " ";
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        i = 1;
        secuencia = "";
        a = 0;
        b = 1;
        while (true) {
            if (i == 1) 
                secuencia += "+ ";
            c = a + b;
            a = b;
            b = c;
            secuencia += "+".repeat(c) + " ";
            i++;
            if ((i - 1) == repeticiones) 
                break;
        }
        System.out.println(secuencia);

        System.out.println("Bucle do while");
        i = 1;
        secuencia = "";
        a = 0;
        b = 1;
        do {
            if (i == 1)
                secuencia += "+ ";
            c = a + b;
            a = b;
            b = c;
            secuencia += "+".repeat(c) + " ";
            i++;
        } while ((i - 1) < repeticiones);
        System.out.println(secuencia);
    }
}
