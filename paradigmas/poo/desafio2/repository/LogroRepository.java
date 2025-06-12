package paradigmas.poo.desafio2.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import paradigmas.poo.desafio2.dominio.Logro;

public class LogroRepository {
    public static final Map<String, Logro> logros = new HashMap<>();

    static {
        logros.put("MUERTE", new Logro("MUERTE", "Que decepción, esperabamos mas de ti..."));
        logros.put("Y_ESTE_CHAD?",
                new Logro("Y_ESTE_CHAD?", "Se dice que alguien como tu solo se encuentra entre mil devs"));
        logros.put("BATERIA_INFINITA", new Logro("BATERIA_INFINITA", "Nunca te detienes, es impresionante!"));
    }
    
    public Optional<Logro> findByName(String nombre) {
        return Optional.ofNullable(logros.get(nombre));
    }
}
