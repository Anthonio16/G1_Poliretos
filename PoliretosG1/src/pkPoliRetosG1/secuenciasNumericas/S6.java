package pkPoliRetosG1.secuenciasNumericas;

public class S6 {
    public static void secuencia6(){
        System.out.println("Bucle for");

        String secuencia = "";
        int acumulador = 1, repeticiones;
        repeticiones = validacion.validarEntrada();
        for (int i = 1; i <= repeticiones*2; i+=2) {
            if(i == 1){
                secuencia += i + " ";
                i += 2;
            }
            acumulador += i;    
            secuencia += acumulador + " ";
        }
        System.out.println(secuencia);
        

        System.out.println("Bucle while");
        secuencia = "";
        int i = 1;
        acumulador = 1;
        while (i <= repeticiones*2) {
            if(i == 1){
                secuencia += i + " ";
                i += 2;
            }
            acumulador += i;
            secuencia += acumulador + " ";
            i += 2;
        }
        System.out.println(secuencia);
        

        System.out.println("Bucle do while");
        secuencia = "";
        i = 1;
        acumulador = 1;
        do {
            if(i == 1){
                secuencia += i + " ";
                i += 2;
            }
            acumulador += i;
            secuencia += acumulador + " ";
            i += 2;
        } while (i <= repeticiones*2);
        System.out.println(secuencia);
}
}