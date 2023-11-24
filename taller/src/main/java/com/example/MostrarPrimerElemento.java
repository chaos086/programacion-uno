package com.example;
import java.util.ArrayList;

public class MostrarPrimerElemento {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Uva");
        listaCadenas.add("Pera");

        if (!listaCadenas.isEmpty()) {
            String primerElemento = listaCadenas.get(0);
            System.out.println("El primer elemento del ArrayList es: " + primerElemento);
        } else {
            System.out.println("El ArrayList está vacío. No hay elementos para mostrar.");
        }
    }
}
