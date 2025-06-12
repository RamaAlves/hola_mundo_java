package paradigmas.estructurada.arreglos;
public class desafio {
    public static void main(String[] args) {
        //normie
        //Calcule la suma de los elementos 
        //que se encuentren en la diagonal

        /* int [][] miArray2D = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        };
        int suma = 0;
        for (int i = 0; i < miArray2D.length; i++) {
            suma += miArray2D[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma); */
        //chad
        //================ NIVEL STONE CHAD =============
        //Dado un arreglo de enteros, devuelva un arreglo por sin elementos repetidos.
        //>:D
        
        int[] arregloConRepetidos = { 1, 2, 3, 3, 2, 2, 0, -1, -1,-4,-3,-5,-1,-3,-5,2,4,5,2,11,1,1 };
        Integer[] temporal = new Integer[arregloConRepetidos.length];
        int contador = 0;
        for (int i = 0; i < arregloConRepetidos.length; i++) {
            for (int j = 0; j < temporal.length; j++) {
                if (temporal[j]!=null &&arregloConRepetidos[i] == temporal[j]) {
                    break;
                } else if (temporal[j] == null) {
                    temporal[j] = arregloConRepetidos[i];
                    contador++;
                    break;
                }
            }
        }
        int arregloSinRepetidos[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            arregloSinRepetidos[i] = temporal[i];
        }
        System.out.println("El arreglo con repetidos es: " );
        for (int elemento : arregloConRepetidos) {
            System.out.print(elemento + ", ");
        }
        System.out.println("\nDe un total de "+ arregloConRepetidos.length+" elementos en el arreglo original, se han encontrado "+contador+" elementos que no se repiten." );
        System.out.println("El arreglo sin repetidos es: ");
        for (int elemento : arregloSinRepetidos) {
            System.out.print(elemento + ", ");
        }
    }
}
