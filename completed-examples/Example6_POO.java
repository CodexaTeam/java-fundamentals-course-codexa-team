class Auto {
    // Atributos
    String color;
    String marca;
    int velocidad;

    // Métodos
    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad = 0;
    }
}

public class Leccion05_Auto {
    public static void main(String[] args) {
        // Sintaxis para crear objetos
        Auto carro1 = new Auto();

        // Asignar valores a los atributos
        carro1.color = "Rojo";
        carro1.marca = "Nissan";
        carro1.velocidad = 0;

        // Usar sus métodos
        carro1.acelerar();
        System.out.println("La velocidad del auto es: " + carro1.velocidad);
    }
}