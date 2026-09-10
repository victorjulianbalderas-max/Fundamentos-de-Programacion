package com.miapp;

import java.util.Scanner;

public class Practica6_2253332397_Scanner
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        double altura, area, base;

        System.out.println("Introduce la Base");
        base = entrada.nextDouble();
        System.out.println("Introduce la Altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("el area es = " + area);
    }
}