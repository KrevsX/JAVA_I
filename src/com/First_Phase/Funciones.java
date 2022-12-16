package com.First_Phase;

public class Funciones {
    public static void main(String[] args) {

        holaaaaaa();
        // holaaaaaa();

        // holamundo("Kevin");
        // holamundo("Alas");

        String hola = devolverHolaMundo();
        System.out.println(hola);
    }

    public static void Ejercicio8() {

        holaaaaaa();
        holamundoFunc("FUNCIONEESSS... CON ARGUMENTOS");

    }

    private static void holamundoFunc(String name) {
        System.out.println("HOLAAAAA " + name);
    }



    public static String devolverHolaMundo(){
        return "Devolver texto, Funciones";
    }

    public static void holaaaaaa() {
        System.out.println("Hola Mundooooo, Funciones");
        System.out.println("Hola Mundooooo, Funciones");
    }
}