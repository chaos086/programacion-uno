package com.example;
import java.util.ArrayList;

public class RecorrerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        System.out.println("Números en el ArrayList:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
