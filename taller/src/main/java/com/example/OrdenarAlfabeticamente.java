package com.example;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenarAlfabeticamente {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Pera");

        Collections.sort(frutas);

        System.out.println("Lista de frutas ordenada alfabéticamente:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
