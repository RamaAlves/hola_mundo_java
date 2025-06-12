package paradigmas.poo.clases.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetApp {
    public static void main(String[] args) {
        treeSetExample();
    }
    
    private static void hashSetExample() {
        Set<String> set = new HashSet<>();

        set.add("manzana");
        set.add("banana");
        set.add("pera");

        set.remove("manzana");

        if (!set.contains("manzana")) {
            System.out.println("El conjunto no contiene la manzana");
        }

        if (!set.isEmpty()) {
            System.out.println("El conjunto no está vacío");
        }

        System.out.println("Iterando con for... ");
        for (String elemento : set) {
            System.out.println(elemento);
        }
        
        System.out.println("Iterando con while e Iterator... ");
        //Iterador
        Iterator<String> iterador = set.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

    }

    private static void treeSetExample() {
        TreeSet<String> set = new TreeSet<>();
        
        set.add("manzana");
        set.add("banana");
        set.add("naranja");
        set.add("uva");

        String firstElement = set.first();
        System.out.println(firstElement);

        Set subSet = set.subSet("manzana", "uva");
        System.out.println("Subset: " + subSet);
        
        
        System.out.println("Iterando... ");
        Iterator<String> iterador = set.iterator();
        while (iterador.hasNext()) {
            Object nextElement = iterador.next();
            System.out.println(nextElement);
        }


    }
}
