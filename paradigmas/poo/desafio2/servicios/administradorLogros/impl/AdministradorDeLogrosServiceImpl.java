package paradigmas.poo.desafio2.servicios.administradorLogros.impl;


import paradigmas.poo.desafio2.dominio.Jugador;
import paradigmas.poo.desafio2.dominio.Logro;
import paradigmas.poo.desafio2.repository.LogroRepository;
import paradigmas.poo.desafio2.servicios.administradorLogros.AdministradorDeLogrosService;

public class AdministradorDeLogrosServiceImpl implements AdministradorDeLogrosService {
    
    private LogroRepository logroRepository;

    public AdministradorDeLogrosServiceImpl() {
        this.logroRepository = new LogroRepository();
    }
    
    @Override
    public void listarLogros(Jugador jugador) {
        for (Logro logro : jugador.getLogrosDesbloqueados()) {
            System.out.printf("logro conseguido %s!: %s", logro.getNombre(), logro.getDescripcion());
            System.out.println();
        }
    }

    @Override
    public void desbloquearLogro(Jugador jugador, String logroDesbloqueado) {
        Logro logro = logroRepository.findByName(logroDesbloqueado).orElse(null);
        if (logro != null && !jugador.tieneLogro(logro)) {
            jugador.desbloquearLogro(logro);
        }
    }
    

}
