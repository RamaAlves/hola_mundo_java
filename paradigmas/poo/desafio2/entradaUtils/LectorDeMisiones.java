package paradigmas.poo.desafio2.entradaUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import paradigmas.poo.desafio2.dominio.Mision;

public class LectorDeMisiones {
    private Scanner scanner;

    public LectorDeMisiones(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Mision> leerMisiones(int cantidadMisiones){
        List<Mision> misiones = new ArrayList<Mision>();
        for (int i = 1; i <= cantidadMisiones; i++) {
            System.out.println("Ingrese los puntos obtenidos en la mision N° " + i + ": ");
            int puntos = leerEnteroPositivo();
            misiones.add( new Mision(i, puntos)  );
        }
        return misiones;
    }

    private int leerEnteroPositivo(){
        int valor = -1;

        while ( valor < 0 ){
            try {
               valor = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Entrada invalida. Ingrese un numero entero : ");
            }
        }
        return valor;
    }


}