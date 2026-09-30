import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problema2_trigonometria {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        System.out.println(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static void mostrarrazones(double grados) {
        double radianes = Math.toRadians(grados);
        double seno = Math.sin(radianes);
        double coseno = Math.cos(radianes);

        System.out.println("Ángulo: " + grados + " grados");
        System.out.println("Seno: " + seno);
        System.out.println("Coseno: " + coseno);
        if (Math.abs(coseno) < 1e-12) {
            System.out.println("Tangente: indefinida");
        } else {
            System.out.println("Tangente: " + Math.tan(radianes));
        }
    }

    public static void main(String[] args) throws IOException {
        double angulo = pedirdato("Ingresa el valor del ángulo (en grados): ");
        mostrarrazones(angulo);
    }
}
