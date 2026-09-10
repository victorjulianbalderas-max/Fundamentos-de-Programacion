package com.miapp;

import java.util.Scanner;

public class Practica6_2253332397_ejercicio03_scanner {

    public static void main(String[] args)
    {
        int d1, m1, a1, d2, m2, a2, dias;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Fecha 1: Introduzca día: ");
        d1 = entrada.nextInt();
        System.out.print("Fecha 1: Introduzca mes: ");
        m1 = entrada.nextInt();
        System.out.print("Fecha 1: Introduzca año: ");
        a1 = entrada.nextInt();

        System.out.print("Fecha 2: Introduzca día: ");
        d2 = entrada.nextInt();
        System.out.print("Fecha 2: Introduzca mes: ");
        m2 = entrada.nextInt();
        System.out.print("Fecha 2: Introduzca año: ");
        a2 = entrada.nextInt();

        dias = d2 - d1 + 30 * (m2 - m1) + 365 * (a2 - a1);
        System.out.println("Días de diferencia: " + dias);
    }
}