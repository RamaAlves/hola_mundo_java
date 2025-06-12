package paradigmas.estructurada.guiaTp;

public class busquedaNumeros {
    
    public static void main(String[] args) {
        int[] numeros = { 5, 2, 3, 6, 1, 4 };
        int numeroBuscado = 3;

        boolean numeroEncontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número " + numeroBuscado + " encontrado en la posición: " + (i + 1));
                numeroEncontrado = true;
                break; // Salir del bucle una vez encontrado
            }
        }
        if (!numeroEncontrado) {
            System.out.println("Número " + numeroBuscado + " no encontrado en el arreglo.");
        }
    }
}
