package com.example;
import java.util.ArrayList;
import java.util.Iterator;

public class EliminarNumerospares {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(25);
        listaNumeros.add(10);
        listaNumeros.add(50);
        listaNumeros.add(5);
        listaNumeros.add(30);

        System.out.println("Lista original: " + listaNumeros);

        eliminarNumerosPares(listaNumeros);

        System.out.println("Lista después de eliminar pares: " + listaNumeros);
    }

    private static void eliminarNumerosPares(ArrayList<Integer> numeros) {
        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero % 2 == 0) {
                iterador.remove();
            }
        }
    }
}
