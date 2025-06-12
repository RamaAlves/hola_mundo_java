package paradigmas.poo.desafio2;

import java.util.List;
import java.util.Scanner;

import paradigmas.poo.desafio2.SalidaUtils.ImpresoraResumen;
import paradigmas.poo.desafio2.dominio.Jugador;
import paradigmas.poo.desafio2.dominio.Mision;
import paradigmas.poo.desafio2.entradaUtils.LectorDeMisiones;
import paradigmas.poo.desafio2.servicios.administradorLogros.AdministradorDeLogrosService;
import paradigmas.poo.desafio2.servicios.administradorLogros.impl.AdministradorDeLogrosServiceImpl;
import paradigmas.poo.desafio2.servicios.evaluador.EvaluadorDeDesempenioService;
import paradigmas.poo.desafio2.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImpl;

public class ChadQuestRPG {
    public static void main(String[] args) {
        AdministradorDeLogrosService administradorDelogrosService = new AdministradorDeLogrosServiceImpl();
        EvaluadorDeDesempenioService evaluadorDeDesempenioService = new EvaluadorDeDesempenioServiceImpl(administradorDelogrosService);

        System.out.println(" Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones ");

        LectorDeMisiones lectorMisiones = new LectorDeMisiones(new Scanner(System.in));
        List<Mision> misiones = lectorMisiones.leerMisiones(5);
        
        Jugador jugador = new Jugador( misiones);
        ImpresoraResumen.imprimir(jugador);
        
        String mensajePostEvaluacion = evaluadorDeDesempenioService.evaluar(jugador);
        String mensajeConstancia = evaluadorDeDesempenioService.mensajeDeConstancia(jugador);
        boolean tieneFallos = evaluadorDeDesempenioService.tieneFallos(jugador);
        String mejorDesempenio = evaluadorDeDesempenioService.misionConMejorDesempenio(jugador);
        administradorDelogrosService.listarLogros(jugador);
        System.out.println(mensajePostEvaluacion);
        System.out.println(mensajeConstancia);
        System.out.println( (tieneFallos)? "Si, ha fallado en una mision": "No ha fallado en ninguna mision" );
        System.out.println(mejorDesempenio);
    }
}
