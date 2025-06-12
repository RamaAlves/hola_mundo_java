package paradigmas.estructurada.guiaTp;

public class triangulo {

    
    public static void main(String[] args) {
        
        int filas = 5;
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas-i; j++ ){
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
