package com.example;
import java.util.ArrayList;

public class MostrarUltimoElemento {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Uva");
        listaCadenas.add("Pera");

        if (!listaCadenas.isEmpty()) {
            String ultimoElemento = listaCadenas.get(listaCadenas.size() - 1);
            System.out.println("El último elemento del ArrayList es: " + ultimoElemento);
        } else {
            System.out.println("El ArrayList está vacío. No hay elementos para mostrar.");
        }
    }
}
