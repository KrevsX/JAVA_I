package com.First_Phase;

public class Sobrecarga_Funciones {

    public static void main(String[] args) {
        
        sobrecargarFunciones();
        sobrecargarFunciones(4);
        sobrecargarFunciones("Nombre Primario");
        sobrecargarFunciones( "nombre1", "nombre2");
    }


    //    Crear metodos para mostrarlos en el paquete de Primera Entrega
    public static void Ejercicio9(){

        sobrecargarFunciones();
        sobrecargarFunciones(4);
        sobrecargarFunciones("Nombre Primario");
        sobrecargarFunciones( "nombre1", "nombre2");


    }

    private static void sobrecargarFunciones() {

        System.out.println("Sobrecargando Funciones");
        System.out.println("Sobrecargando Funciones");
    }

    private static void sobrecargarFunciones(String name) {

        System.out.println("Sobrecargando Funciones " + name);

    }

    private static void sobrecargarFunciones(String name, String surnames) {

        System.out.println("Sobrecargando Funciones " + name + " " + surnames);
    }

    private static void sobrecargarFunciones(Integer number) {

        System.out.println("el numero Es: " + number);

    }
}
