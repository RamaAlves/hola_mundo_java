package paradigmas.poo.desafio2.dominio;

import java.util.Objects;

public class Logro {
    private String nombre;
    private String descripcion;

    public Logro(String nombre, String descripcion) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del logro no puede ser nulo o estar vacío.");
        }
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logro otroLogro = (Logro) o;
        return this.nombre.equals(otroLogro.nombre);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }


}

