package com.miapp;

import java.io.*;

public class Practica6_2253332397 {

    public static void main(String args[]) throws IOException
    {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double altura, area, base;

        System.out.println("Introduce la Base");
        base = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce la Altura");
        altura = Double.parseDouble(entrada.readLine());
        area = base * altura;
        System.out.println("el area es = " + area);
    }
}
