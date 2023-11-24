package com.example;
import java.util.ArrayList;

public class VerificarArrayListVacio {
    public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<>();

        if (miArrayList.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío. Contiene elementos.");
        }

        miArrayList.add("Elemento1");
        miArrayList.add("Elemento2");

        if (miArrayList.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío. Contiene elementos.");
        }
    }
}
