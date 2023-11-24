package com.example;
import java.util.ArrayList;

public class VerificarNombreEnArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Luisa");

        if (nombres.contains("Carlos")) {
            System.out.println("El nombre 'Carlos' está presente en la lista de nombres.");
        } else {
            System.out.println("El nombre 'Carlos' no está presente en la lista de nombres.");
        }
    }
}
