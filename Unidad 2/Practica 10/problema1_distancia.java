import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problema1_distancia {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        System.out.println(mensaje);
        return Double.parseDouble(lectura.readLine());
    }

    public static double distanciaeuclidiana(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Distancia euclidiana entre dos puntos");
        double x1 = pedirdato("Ingresa x1: ");
        double y1 = pedirdato("Ingresa y1: ");
        double x2 = pedirdato("Ingresa x2: ");
        double y2 = pedirdato("Ingresa y2: ");
        System.out.println("La distancia entre los puntos es: " + distanciaeuclidiana(x1, y1, x2, y2));
    }
}
	