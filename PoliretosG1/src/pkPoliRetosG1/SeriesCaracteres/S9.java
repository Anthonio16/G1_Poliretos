package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S9 {
        public static void secuencia9() {
        int repeticiones = validacion.validarEntrada();
        int a = 0, b = 1, c;
        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z' };

        System.out.println("Bucle For");
        String secuencia = "", letraActual = "";
        int i, posicion = 0;
        for(i = 0; i < repeticiones; i++) {
            if ((i == 0)||(i == 2)) {
                c = 1;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(c) + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        secuencia = "";
        i = 0;
        posicion = 0;
        a = 0;
        b = 1;
        while(i < repeticiones) {
            if ((i == 0)||(i == 2)) 
                c = 1;
            else {
                c = a + b;
                a = b;
                b = c;
            }
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(c) + " ";
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
        a = 0;
        b = 1;
        do {
            if ((i == 0)||(i == 2))
                c = 1;
            else {
                c = a + b;
                a = b;
                b = c;
            }
            letraActual = String.valueOf(abecedario[posicion]);
            secuencia += letraActual.repeat(c) + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
            i++;
        } while (i < repeticiones);
        System.out.println(secuencia);

    }
}