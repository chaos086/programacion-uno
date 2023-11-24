package com.example;

import java.util.ArrayList;

public class EliminarElementos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        System.out.println("ArrayList antes de eliminar los elementos:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        numeros.clear();

        System.out.println("ArrayList después de eliminar los elementos:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
