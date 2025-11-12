package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S7 {
    public static void secuencia7() {
        int repeticiones = validacion.validarEntrada();

        char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z' };

        System.out.println("Bucle For");
        String secuencia = "";
        int i, posicion = 0;
        boolean simboloPositivo = true;
        for(i = 0; i < repeticiones; i++) {
            if ((i+1)%2==0)
                if(simboloPositivo){
                    secuencia += "+ ";
                    simboloPositivo = false;
                }else{
                    secuencia += "- ";
                    simboloPositivo = true;
                }
            else
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
        simboloPositivo = true;
        while(i < repeticiones) {
            if ((i+1)%2==0)
                if(simboloPositivo){
                    secuencia += "+ ";
                    simboloPositivo = false;
                }else{
                    secuencia += "- ";
                    simboloPositivo = true;
                }
            else
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
        simboloPositivo = true;
        do {
            if ((i+1)%2==0)
                if(simboloPositivo){
                    secuencia += "+ ";
                    simboloPositivo = false;
                }else{
                    secuencia += "- ";
                    simboloPositivo = true;
                }
            else
                secuencia += abecedario[posicion] + " ";
            posicion++;
            if(posicion == abecedario.length)
                posicion = 0;
            i++;
        } while(i < repeticiones);
        System.out.println(secuencia);
    }
}
