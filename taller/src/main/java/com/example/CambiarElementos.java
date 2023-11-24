package com.example;
import java.util.ArrayList;
import java.util.Collections;

public class CambiarElementos {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Uva");
        listaCadenas.add("Pera");

        System.out.println("Lista antes del cambio: " + listaCadenas);

        Collections.fill(listaCadenas, "Hola");

        System.out.println("Lista después del cambio: " + listaCadenas);
    }
}
