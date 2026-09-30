import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class ejercicio01_a {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularareatriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
    }

    public static void circulo() throws IOException {
        double radio = pedirdato("Ingresa el radio del círculo: ");
        System.out.println("El área del círculo es: " + calcularareacirculo(radio));
    }

    public static void triangulo() throws IOException {
        double base = pedirdato("Ingresa la base del triángulo: ");
        double altura = pedirdato("Ingresa la altura del triángulo: ");
        System.out.println("El área del triángulo es: " + calcularareatriangulo(base, altura));
    }

    public static void main(String[] args) throws IOException {
        String opcion;
        do {
            mostrarmenu();
            opcion = lectura.readLine().toUpperCase();
            switch (opcion) {
                case "C":
                    circulo();
                    break;
                case "T":
                    triangulo();
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!(opcion.equals("S")));
    }
}
