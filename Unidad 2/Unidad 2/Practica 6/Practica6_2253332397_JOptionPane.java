package com.miapp;

import javax.swing.JOptionPane;

public class Practica6_2253332397_JOptionPane
{
    public static void main(String args[])
    {
        double altura, area, base;
        String entrada;

        entrada = JOptionPane.showInputDialog("Introduce la Base");
        base = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Introduce la Altura");
        altura = Double.parseDouble(entrada);

        area = base * altura;
        JOptionPane.showMessageDialog(null, "el area es = " + area);
    }
}