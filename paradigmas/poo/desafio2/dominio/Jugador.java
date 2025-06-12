package paradigmas.poo.desafio2.dominio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jugador {
    private List<Mision> misiones;
    private Set<Logro> logrosDesbloqueados;

    public Jugador(List<Mision> misiones) {
        this.misiones = misiones;
        this.logrosDesbloqueados = new HashSet<Logro>();
    }

    public List<Mision> getMisiones() {
        return this.misiones;
    }

    public Set<Logro> getLogrosDesbloqueados() {
        return this.logrosDesbloqueados;
    }
    
    public boolean tieneLogro(Logro logro) {
        return this.logrosDesbloqueados.contains(logro);
    }

    public void desbloquearLogro(Logro logro) {
        this.logrosDesbloqueados.add(logro);
    }


    public int calcularTotal(){
        int total = 0;
        for (Mision mision : misiones) {
            total += mision.getPuntaje();
        }
        return total;
    }

    public Mision misionConMayorPuntaje(){
        Mision misionConMayorPuntaje = misiones.get(0);
        for (Mision mision : misiones) {
            if( mision.getPuntaje() > misionConMayorPuntaje.getPuntaje() ){
                misionConMayorPuntaje = mision;
            }
        }
        return misionConMayorPuntaje;
    }

    public Mision misionConMenorPuntaje(){
        Mision misionConMenorPuntaje = misiones.get(0);
        for (Mision mision : misiones) {
            if( mision.getPuntaje() < misionConMenorPuntaje.getPuntaje() ){
                misionConMenorPuntaje = mision;
            }
        }
        return misionConMenorPuntaje;
    }

    public boolean tieneMisionFallida(){
        for (Mision mision : misiones) {
            if( mision.esFallida() ){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean esConstante(){
        return misionConMayorPuntaje().getPuntaje() - misionConMenorPuntaje().getPuntaje() < 20;
    }

}