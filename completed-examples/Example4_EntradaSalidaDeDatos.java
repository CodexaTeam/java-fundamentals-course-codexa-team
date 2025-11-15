import java.util.Scanner;  // Importar la clase Scanner

public class Leccion4_EntradaSalida {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario su nombre
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();  // Lee el nombre del usuario

        // Mostrar un mensaje usando el nombre ingresado
        System.out.println("¡Hola, " + nombre + "!");

        // Cerrar el scanner
        scanner.close();
    }
}
