package com.example;
import java.util.ArrayList;

public class AgregarNombreSegundaPosicion {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Luisa");

        System.out.println("ArrayList antes de agregar \"Pedro\" en la segunda posición:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        nombres.add(1, "Pedro");

        System.out.println("ArrayList después de agregar \"Pedro\" en la segunda posición:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
