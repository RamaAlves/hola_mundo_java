package paradigmas.poo.desafio2.servicios.evaluador;

import paradigmas.poo.desafio2.dominio.Jugador;

public interface EvaluadorDeDesempenioService {

    String evaluar(Jugador jugador);

    String mensajeDeConstancia(Jugador jugador);

    boolean tieneFallos(Jugador jugador);
    
    String misionConMejorDesempenio(Jugador jugador);
} 
