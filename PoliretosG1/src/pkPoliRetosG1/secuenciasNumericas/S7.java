package pkPoliRetosG1.secuenciasNumericas;

public class S7 {
    public static void main(String[] args){
            
        
        System.out.println("Bucle for");
        String secuencia = "";
        int acumulador = 1,repeticiones;
        repeticiones = validacion.validarEntrada();
        for (int i = 1; i <= repeticiones; i++) {
            if(i == 1){
                secuencia += i + " ";
            }else{
                acumulador += 3;
                secuencia += acumulador + " ";
            }
        }
        System.out.println(secuencia);

        
        System.out.println("Bucle while");
        secuencia = "";
        int i = 1;
        acumulador = 1;
        while (i <= repeticiones) {
            if(i == 1)
                secuencia += i + " ";
            else{
                acumulador += 3;
                secuencia += acumulador + " ";
            }
            i++;
        }
        System.out.println(secuencia);


        System.out.println("Bucle do while");
        secuencia = "";
        i = 1;
        acumulador = 1;
        do {
            if(i == 1)
                secuencia += i + " ";
            else{
                acumulador += 3;
                secuencia += acumulador + " ";
            }  
            i++;
        } while (i <= repeticiones);
        System.out.println(secuencia);
    }
}