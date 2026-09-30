import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class problema3_impares {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static int pedirentero(String mensaje) throws IOException {
        System.out.println(mensaje);
        return Integer.parseInt(lectura.readLine());
    }

    public static int sumaimpares(int n) {
        int suma = 0;
        int impar = 1;
        for (int i = 1; i <= n; i++) {
            suma = suma + impar;
            impar = impar + 2;
        }
        return suma;
    }

    public static void main(String[] args) throws IOException {
        int n = pedirentero("¿Cuántos números impares quieres sumar? ");
        if (n <= 0) {
            System.out.println("Ingresa un número entero mayor que cero.");
        } else {
            System.out.println("La suma de los " + n + " primeros impares es: " + sumaimpares(n));
        }
    }
}
