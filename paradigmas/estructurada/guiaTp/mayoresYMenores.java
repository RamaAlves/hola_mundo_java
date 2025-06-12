package paradigmas.estructurada.guiaTp;

import java.util.Scanner;

public class mayoresYMenores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números para agregarlos a la lista:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número:");
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }
        
        scanner.close();

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
