import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double monto, descuento, subtotal, total;
        int tipo;
        System.out.println("Introduce el monto del servicio");
        monto = Double.parseDouble(entrada.readLine());
        System.out.println("Tipo de usuario: 1-Profesor  2-Alumno  3-Publico general");
        tipo = Integer.parseInt(entrada.readLine());

        descuento = 0;
        if (tipo == 1)
            descuento = 0.20;
        if (tipo == 2)
            descuento = 0.10;

        subtotal = monto - (monto * descuento);
        total = subtotal + (subtotal * 0.16);

        System.out.println("Subtotal con descuento: " + subtotal);
        System.out.println("Total a pagar (con IVA 16%): " + total);
        System.exit(0);
    }
}
