import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double monto, descuento, subtotal, total;
        int tipo;
        System.out.println("Introduce el monto del servicio");
        monto = entrada.nextDouble();
        System.out.println("Tipo de usuario: 1-Profesor  2-Alumno  3-Publico general");
        tipo = entrada.nextInt();

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
