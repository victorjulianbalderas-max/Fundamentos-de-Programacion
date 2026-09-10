package com.miapp;

import javax.swing.JOptionPane;

public class Practica6_2253332397_ejercicio02_JOptionPane {

    public static void main(String[] args)
    {
        int numero;
        int dm, um, c, d, u;
        String salida;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999: "));

        dm = numero / 10000;
        numero = numero % 10000;
        um = numero / 1000;
        numero = numero % 1000;
        c = numero / 100;
        numero = numero % 100;
        d = numero / 10;
        numero = numero % 10;
        u = numero;

        salida = u + " " + d + " " + c + " " + um + " " + dm;

        numero = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        salida = salida + "\n" + numero;

        JOptionPane.showMessageDialog(null, salida);
    }
}