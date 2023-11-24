package com.example;
import java.util.ArrayList;

public class CambiarSegundoNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Luisa");

        if (nombres.size() >= 2) {
            nombres.set(1, "Ana");
            System.out.println("Lista de nombres después del cambio: " + nombres);
        } else {
            System.out.println("La lista no tiene suficientes elementos para cambiar el segundo nombre.");
        }
    }
}
