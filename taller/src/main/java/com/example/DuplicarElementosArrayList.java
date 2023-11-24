package com.example;

import java.util.ArrayList;

public class DuplicarElementosArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        duplicarElementos(numeros);

        System.out.println("ArrayList después de duplicar los elementos:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    private static void duplicarElementos(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            int elementoDuplicado = lista.get(i) * 2;
            lista.set(i, elementoDuplicado);
        }
    }
}
