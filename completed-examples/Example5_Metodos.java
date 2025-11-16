public class Leccion4_Metodos {
    public static void main(String[] args) {
        // Llamar al método sumar y mostrar el resultado
        int resultado = sumar(5, 3);  // Pasamos los números 5 y 3 al método
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
}