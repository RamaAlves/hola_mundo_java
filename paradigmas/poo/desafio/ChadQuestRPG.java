package paradigmas.poo.desafio;

import java.util.List;
import java.util.Scanner;

import paradigmas.poo.desafio.SalidaUtils.ImpresoraResumen;
import paradigmas.poo.desafio.dominio.JuegoRPG;
import paradigmas.poo.desafio.dominio.Jugador;
import paradigmas.poo.desafio.dominio.Mision;
import paradigmas.poo.desafio.entradaUtils.LectorDeMisiones;

public class ChadQuestRPG {
     public static void main(String[] args) {
        System.out.println(" Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones ");

        LectorDeMisiones lector = new LectorDeMisiones(new Scanner(System.in));
        List<Mision> misiones = lector.leerMisiones(5);

        Jugador jugador = new Jugador( misiones );
        JuegoRPG juego = new JuegoRPG(jugador);
        juego.evaluar();
        ImpresoraResumen.imprimir(jugador);
    }
}
