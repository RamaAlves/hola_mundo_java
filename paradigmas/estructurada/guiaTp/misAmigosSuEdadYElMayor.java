package paradigmas.estructurada.guiaTp;

public class misAmigosSuEdadYElMayor {
    
    public static void main(String[] args) {
        String[] amigos = { "Juan", "Ana", "Pedro", "Maria", "Luis" };
        int[] edades = { 15, 30, 22, 28, 35 };
        int indiceMayorAmigo = 0;

        System.out.println("Mis amigos y sus edades son:");
        for (int i = 0; i < amigos.length; i++) {
            if (edades[i] < 18) {
                System.out.println("No muestro el nombre de X porque es menor de edad.");
            } else {
                System.out.println(amigos[i] + " tiene " + edades[i] + " años.");
            }
            if (edades[i] > edades[indiceMayorAmigo]) {
                indiceMayorAmigo = i; // Actualizar el índice del amigo mayor
            }
        }
        System.out.println("El amigo mayor es " + amigos[indiceMayorAmigo] + " con " + edades[indiceMayorAmigo] + " años.");
    }
}
