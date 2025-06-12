package paradigmas.poo.desafio2.servicios.evaluador.impl;

import paradigmas.poo.desafio2.dominio.Jugador;
import paradigmas.poo.desafio2.dominio.Mision;
import paradigmas.poo.desafio2.servicios.administradorLogros.AdministradorDeLogrosService;
import paradigmas.poo.desafio2.servicios.evaluador.EvaluadorDeDesempenioService;

public class EvaluadorDeDesempenioServiceImpl implements EvaluadorDeDesempenioService {
    private AdministradorDeLogrosService administradorDeLogrosService;

    public EvaluadorDeDesempenioServiceImpl(AdministradorDeLogrosService administradorDeLogrosService) {
        this.administradorDeLogrosService = administradorDeLogrosService;
    }
    
    @Override
    public String evaluar(Jugador jugador) {
        int total = jugador.calcularTotal();
        if (total > 300) {
            administradorDeLogrosService.desbloquearLogro(jugador, "Y_ESTE_CHAD?");
            return "¡Felicidades! Sos un verdadero Chad del RPG ";
        } else {
            return "Te falta entrenamiento, joven aprendiz...";
        }
    }
    
    @Override
    public String mensajeDeConstancia(Jugador jugador) {
        if (jugador.esConstante()) {
            administradorDeLogrosService.desbloquearLogro(jugador, "BATERIA_INFINITA");
            return "¡Ejecución constante! Sos el sueño de un arquitecto de software.";
        }
        return "";
    }

    @Override
    public boolean tieneFallos(Jugador jugador) {
        boolean fallo = jugador.tieneMisionFallida();
        if(fallo){
            administradorDeLogrosService.desbloquearLogro(jugador, "MUERTE");
        }
        return fallo;
    }

    @Override
    public String misionConMejorDesempenio(Jugador jugador){
        Mision mejorMision = jugador.misionConMayorPuntaje();
        return "La mision que mejor rendimiento tuvo es la mision N° " + mejorMision.getNumero() + " con " + mejorMision.getPuntaje() + " puntos. ";
    }


}
