package paradigmas.estructurada.desafio;

import java.util.Scanner;

public class ChadQuestRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] puntosPorMision = new int[5];
        int total = 0;
        int mejorDesempenio = 0;
        int peorDesempenio = 0;
        boolean fallo = false;
        int miniStoneChad = 0;
        puntosPorMision[0] = 51;
        puntosPorMision[1] = 80;
        puntosPorMision[2] = 60;
        System.out.println("Ingrese el puntaje de la mision 4");
        puntosPorMision[3] = scanner.nextInt();
        System.out.println("Ingrese el puntaje de la mision 5");
        puntosPorMision[4] = scanner.nextInt();
        scanner.close();
        
        
        System.out.println("--------------------------------------------");
        System.out.println("------------Mostrando resultados------------");
        System.out.println("--------------------------------------------");
        System.out.println("Mision      Puntaje     Acumulado55");
        for (int i = 0; i < puntosPorMision.length; i++) {
            total += puntosPorMision[i];
            if (puntosPorMision[i] > puntosPorMision[mejorDesempenio]) {
                mejorDesempenio = i;
            }
            if (puntosPorMision[i] < puntosPorMision[peorDesempenio]) {
                peorDesempenio = i;
            }
            if (puntosPorMision[i] > 75) {
                miniStoneChad++;
            }
            if (puntosPorMision[i] == 0) {
                fallo = true;
            }
            System.out.println(String.format("  %d              %d              %d", i+1, puntosPorMision[i],  total));
        }
        System.out.println(String.format("Total:--------------------------> %d", total));

        System.out.println("----------------------------------------------");
        System.out.println("Puntos acumulados hasta ahora: " + total);
        if (total > 300) {
            System.out.println("Eres un verdadero Chad del RPG!!!");
        } else {
            System.out.println("Te falta entrenamiento joven aprendiz");
        }
        System.out.println("tu mejor mision fue la " + (mejorDesempenio + 1) + " con " + puntosPorMision[mejorDesempenio]
                + " puntos");

        if (fallo) {
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }
        if (puntosPorMision[mejorDesempenio] - puntosPorMision[peorDesempenio] < 20) {
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
        }
        if (miniStoneChad >= 3) {
            System.out.println("Nivel desbloqueado: Mini Stone Chad");
        }
        
        
    }
}
