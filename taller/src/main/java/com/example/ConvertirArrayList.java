package com.example;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertirArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");

        String[] arrayCadenas = listaCadenas.toArray(new String[0]);

        System.out.println("Array de cadenas:");
        System.out.println(Arrays.toString(arrayCadenas));
    }
}
