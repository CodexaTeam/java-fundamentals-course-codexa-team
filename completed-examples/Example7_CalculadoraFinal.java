
import java.util.Scanner;

public class Leccion6_CalculadoraFinal {
    
    // Atributos de la clase
    private int numero1;
    private int numero2;

    // Métodos de operaciones matemáticas
    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return (double) numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
    }

    // Constructor de la clase
    public Leccion6_CalculadoraFinal(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Crear un objeto de la clase Calculadora
        Leccion6_CalculadoraFinal calculadora = new Leccion6_CalculadoraFinal(numero1, numero2);

        // Mostrar el menú de operaciones
        System.out.println("Elige la operación: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = scanner.nextInt();

        // Ejecutar la operación elegida
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + calculadora.sumar());
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + calculadora.restar());
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicar());
                break;
            case 4:
                System.out.println("El resultado de la división es: " + calculadora.dividir());
                break;
            default:
                System.out.println("Opción no válida.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
