package com.miapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica6_2253332397_ejercicio05 {

    public static void main(String[] args) throws IOException
    {
        int cant, sumacant;
        String salida;
        double precio, subtotal, iva, total, sumaiva, sumatotal;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = Integer.parseInt(entrada.readLine());

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);

        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = Integer.parseInt(entrada.readLine());

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio pieza de pan francés: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada piezas de pan francés: ");
        cant = Integer.parseInt(entrada.readLine());

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