package com.example;
import java.util.ArrayList;

public class TresArraylistVacios {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listaDeListas = new ArrayList<>();

        listaDeListas.add(new ArrayList<>());
        listaDeListas.add(new ArrayList<>());
        listaDeListas.add(new ArrayList<>());

        System.out.println("ArrayList de ArrayLists vacíos: " + listaDeListas);
    }
}
