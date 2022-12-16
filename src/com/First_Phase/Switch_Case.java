package com.First_Phase;

public class Switch_Case {

    public static void main(String[] args) {

        String weather = "Sunny";

        switch (weather){

            case "Sunny":
                System.out.println("El tiempo es Soleado");
                break;

            case "Cloudy":
                System.out.println("El Tiempo es Nublado");
                break;

            default:
                System.out.println("No se ha podido identificar el Clima");
        }
    }

    //    Crear metodos para mostrarlos en el paquete de Primera Entrega
    public static void Ejercicio7() {
        String weather = "Sunny";

        switch (weather) {

            case "Sunny":
                System.out.println("El tiempo es Soleado");
                break;

            case "Cloudy":
                System.out.println("El Tiempo es Nublado");
                break;

            default:
                System.out.println("No se ha podido identificar el Clima");
        }
    }
}
