package paradigmas.estructurada.guiaTp;

public class misAmigos {
    
    public static void main(String[] args) {
    
        String[] amigos = {"Juan", "Ana", "Pedro", "Maria", "Luis"};
        
        System.out.println("Mis amigos son:");
        
        for (int i = 0; i < amigos.length; i++) {
            System.out.println(amigos[i]);
        }
        
        System.out.println("Total de amigos: " + amigos.length);
        
        // Agregar un nuevo amigo
        String nuevoAmigo = "Carlos";
        String[] nuevosAmigos = new String[amigos.length + 1];
        
        for (int i = 0; i < amigos.length; i++) {
            nuevosAmigos[i] = amigos[i];
        }
        
        nuevosAmigos[amigos.length] = nuevoAmigo;
        
        System.out.println("Después de agregar un nuevo amigo:");
        for (String amigo : nuevosAmigos) {
            System.out.println(amigo);
        }
    
    }
}
