package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S6 {
    public static void secuencia6() {
        int repeticiones = validacion.validarEntrada();

        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z' };

        System.out.println("Bucle For");
        String secuencia = "";
        int i, posicion = 0;
        for(i = 0; i < repeticiones; i++) {
            secuencia += abecedario[posicion] + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        secuencia = "";
        i = 0;
        posicion = 0;
        while(i < repeticiones) {
            secuencia += abecedario[posicion] + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
            i++;
        }
        System.out.println(secuencia);

        System.out.println("Bucle do while");
        secuencia = "";
        i = 0;
        posicion = 0;
        do {
            secuencia += abecedario[posicion] + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
            i++;
        } while(i < repeticiones);
        System.out.println(secuencia);

    }
}
