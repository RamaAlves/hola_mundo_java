package paradigmas.poo.clases.listas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListasApp {
    public static void main(String[] args) {
        finalExample();
    }
    
    private static void listArrayExample() {
        ArrayList<String> nombresUsuarios = new ArrayList<String>();
        nombresUsuarios.add("Juan");
        nombresUsuarios.add("Maria");
        nombresUsuarios.add("Roberto");

    }

    private static void linkedListArrayExample() {
        LinkedList<String> tareasPendientes = new LinkedList<String>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Ir al gym");
        tareasPendientes.add("Estudiar para el examen");
    }

    private static void finalExample() {
        
        List<String> nombresUsuarios = new ArrayList<String>();
        
        nombresUsuarios.add("Juan");
        nombresUsuarios.add("Pedro");
        nombresUsuarios.add("Maria");

        List<String> linkedNombresUsuarios = new LinkedList<>(nombresUsuarios);
        System.out.println(linkedNombresUsuarios);
    }

}
