package com.example;
import java.util.ArrayList;

public class MostrarTercerElemento {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(5);
        listaNumeros.add(10);
        listaNumeros.add(15);
        listaNumeros.add(20);
        listaNumeros.add(25);

        if (listaNumeros.size() >= 3) {
            int tercerElemento = listaNumeros.get(2);
            System.out.println("El tercer elemento de la lista es: " + tercerElemento);
        } else {
            System.out.println("La lista no tiene suficientes elementos para mostrar el tercer elemento.");
        }
    }
}
