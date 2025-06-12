package paradigmas.estructurada.guiaTp;

import java.util.Scanner;
import java.util.Arrays;

public class esPalindromo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();
        scanner.close();

        String[] palabraArray = new String[palabra.length()];
        String[] palabraArrayInverso = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            palabraArray[i] = palabra.substring(i, i + 1);
            palabraArrayInverso[i] = palabra.substring(palabra.length() - 1 - i, palabra.length() - i);
        }
        if (Arrays.equals(palabraArray,palabraArrayInverso)) {
            System.out.println("La palabra ingresada es un palíndromo");
        }
        else {
            System.out.println("La palabra ingresada no es un palíndromo");
        }
        
        

    }    
}
