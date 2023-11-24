package com.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(25);
        listaNumeros.add(10);
        listaNumeros.add(50);
        listaNumeros.add(5);
        listaNumeros.add(30);

        int numeroMasGrande = encontrarNumeroMasGrande(listaNumeros);

        System.out.println("El número más grande en la lista es: " + numeroMasGrande);
    }
    private static int encontrarNumeroMasGrande(ArrayList<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("La lista está vacía.");
            return Integer.MIN_VALUE; 
        }

        int numeroMasGrande = numeros.get(0);

        for (int numero : numeros) {
            if (numero > numeroMasGrande) {
                numeroMasGrande = numero;
            }
        }

        return numeroMasGrande;
    }
}