package com.miapp;

import javax.swing.JOptionPane;

public class Practica6_2253332397_ejercicio05_JOptionPane {

    public static void main(String[] args)
    {
        int cant, sumacant;
        String salida, salidaFinal = "";
        double precio, subtotal, iva, total, sumaiva, sumatotal;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del Refresco coca cola light lata: "));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del Refresco coca cola light lata: "));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        salidaFinal = salidaFinal + salida + "\n";

        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio 1/4 de Arroz: "));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del 1/4 de Arroz: "));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        salidaFinal = salidaFinal + salida + "\n";

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio pieza de pan francés: "));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada piezas de pan francés: "));

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        salidaFinal = salidaFinal + salida + "\n";

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        salidaFinal = salidaFinal + "el total de productos vendidos fue " + sumacant + "\n";
        salidaFinal = salidaFinal + "el total del iva fue " + sumaiva + "\n";
        salidaFinal = salidaFinal + "el total ----------> " + sumatotal;

        JOptionPane.showMessageDialog(null, salidaFinal);
    }
}