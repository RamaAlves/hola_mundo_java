package paradigmas.poo.desafio2.dominio;

public class Mision {
    private int numero;
    private int puntaje;

    //constructor
    public Mision(int numero, int puntaje) {
        this.numero = numero;
        this.puntaje = puntaje;
    }

    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //otros metodos
    public boolean esFallida(){
        return this.puntaje == 0;
    }

}
