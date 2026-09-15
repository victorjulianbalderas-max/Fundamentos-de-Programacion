import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String args[]) {
        double monto, descuento, subtotal, total;
        int tipo;
        monto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto del servicio"));
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de usuario: 1-Profesor  2-Alumno  3-Publico general"));

        descuento = 0;
        if (tipo == 1)
            descuento = 0.20;
        if (tipo == 2)
            descuento = 0.10;

        subtotal = monto - (monto * descuento);
        total = subtotal + (subtotal * 0.16);

        JOptionPane.showMessageDialog(null, "Subtotal con descuento: " + subtotal + "\nTotal a pagar (con IVA 16%): " + total);
        System.exit(0);
    }
}
