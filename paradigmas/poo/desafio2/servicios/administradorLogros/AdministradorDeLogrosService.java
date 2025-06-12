package paradigmas.poo.desafio2.servicios.administradorLogros;


import paradigmas.poo.desafio2.dominio.Jugador;

public interface AdministradorDeLogrosService {

    void listarLogros(Jugador jugador);

    void desbloquearLogro(Jugador jugador, String logro);
} 
