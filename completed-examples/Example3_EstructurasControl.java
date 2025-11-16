
import java.util.Scanner;

public class Leccion3_EstructurasControl {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Usar una estructura de control (if-else) para verificar el número
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Usar un bucle (for) para imprimir números del 1 al 5
        System.out.println("Contando hasta 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
