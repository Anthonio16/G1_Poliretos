package pkPoliRetosG1.SeriesCaracteres;

import pkPoliRetosG1.secuenciasNumericas.validacion;

public class S3 {
    public static void main(String[] args) {
        int repeticiones = validacion.validarEntrada();
        String secuencia = "";
        int contadorDivisores = 0;

        /*     
        System.out.println("Bucle For");
        for (int i = 1; i <= repeticiones; i++) {
            System.out.println("Entro al for");
            if (i % 2 == 0) 
                contadorDivisores++;    
            secuencia += "+".repeat(i) + " ";
            else 
                i -= 1;
        }
        System.out.println(secuencia);
        */
        System.out.println("Bucle While");
        secuencia = "";

        int i = 1, j = 1, auxiliar = 1;
        while (i <= (repeticiones+1)) {
            j = 1;
            contadorDivisores = 0;
            while (j <= auxiliar) {
                if(auxiliar % j == 0)
                    contadorDivisores++;
                j++;
            }
            if(i == 1)
                i++;
            if(contadorDivisores == 2){
                secuencia += "+".repeat(auxiliar) + " ";
                i++;
            }
            auxiliar++;
        }
        System.out.println(secuencia);

        
        System.out.println("Bucle do while");
        secuencia = "";
        i = 1;
        j = 1;
        auxiliar = 1;
        do {
            j = 1;
            contadorDivisores = 0;
            do {
                if(auxiliar % j == 0)
                    contadorDivisores++;
                j++;
            } while (j <= auxiliar);
            if(i == 1)
                i++;
            if(contadorDivisores == 2){
                secuencia += "+".repeat(auxiliar) + " ";
                i++;
            }
            auxiliar++;
        } while (i <= (repeticiones+1));
        System.out.println(secuencia);       
    }
}
