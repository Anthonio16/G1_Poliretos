package pkPoliRetosG1.secuenciasNumericas;

public class S10 {
    public static void secuencia10(){
        
        System.out.println("Bucle for");
        String secuencia = "";
        int i, acumulador = 1, repeticiones;

        repeticiones = validacion.validarEntrada();

        for (i = 1; i <= repeticiones; i++) {
            acumulador *= 3;
            secuencia += acumulador + " ";
        }
        System.out.println(secuencia);

        System.out.println("Bucle while");
        secuencia = "";
        i = 1;
        acumulador = 1;
        while (i <= repeticiones) {
            acumulador *= 3;
            secuencia += acumulador + " ";
            i++;
        }
        System.out.println(secuencia);

        System.out.println("Bucle do while");
        secuencia = "";
        i = 1;
        acumulador = 1;
        do {
            acumulador *= 3;
            secuencia += acumulador + " ";
            i++;
        } while (i <= repeticiones);
        System.out.println(secuencia);
    }
}
