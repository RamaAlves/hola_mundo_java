package paradigmas.poo.clases.maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    
    public static void main(String[] args) {

        hashMapExample();
    }
    
    private static void hashMapExample() {
        Map<String, String> definiciones = new HashMap<String, String>();

        definiciones.put("Java", "Lenguaje de programación orientado a objetos");
        definiciones.put("Python", "Lenguaje de programación interpretado y dinámico");
        definiciones.put("C++", "Lenguaje de programación de alto rendimiento y eficiencia");

        System.out.println(definiciones);

        String valor = definiciones.get("Java");
        System.out.println(valor);
        
        definiciones.remove("Java");
        System.out.println(definiciones);
        
        System.out.println(definiciones.containsKey("Java"));
        System.out.println(definiciones.containsValue("Lenguaje de programación interpretado y dinámico"));

        for (Map.Entry<String, String> elemento : definiciones.entrySet()) {
            System.out.println("Clave: "+elemento.getKey()+ ", Valor: "+elemento.getValue());
        }
    }

}
