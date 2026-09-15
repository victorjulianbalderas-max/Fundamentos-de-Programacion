package com.miapp;

import java.util.Scanner;

public class Practica6_2253332397_ejercicio05_scanner {

    public static void main(String[] args)
    {
        int cant, sumacant;
        String salida;
        double precio, subtotal, iva, total, sumaiva, sumatotal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);

        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio pieza de pan francés: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada piezas de pan francés: ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println("el total del iva fue " + sumaiva);
        System.out.println("el total ----------> " + sumatotal);
    }
}