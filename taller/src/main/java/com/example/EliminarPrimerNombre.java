package com.example;
import java.util.ArrayList;

public class EliminarPrimerNombre {
    public static void main(String[] args) {
        // Crear un ArrayList de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar algunos nombres a la lista
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Luisa");

        // Eliminar el primer nombre
        if (!nombres.isEmpty()) {
            nombres.remove(0);
            System.out.println("Lista de nombres después de eliminar el primer nombre: " + nombres);
        } else {
            System.out.println("La lista está vacía, no hay nombres para eliminar.");
        }
    }
}
