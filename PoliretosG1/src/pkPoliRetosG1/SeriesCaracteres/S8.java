package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S8 {
    public static void main(String[] args) {
        int repeticiones = validacion.validarEntrada();

        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z' };

        System.out.println("Bucle For");
        String secuencia = "", letraActual = "";
        int i, posicion = 0, acumulador = 0;
        for(i = 0; i < repeticiones; i++) {
            acumulador += 2;
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(acumulador) + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        secuencia = "";
        i = 0;
        posicion = 0;
        acumulador = 0;
        while(i < repeticiones) {
            acumulador += 2;
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(acumulador) + " ";
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
        acumulador = 0;
        do {
            acumulador += 2;
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(acumulador) + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
            i++;
        } while(i < repeticiones);
        System.out.println(secuencia);

    }
}
