package com.First_Phase;

public class EC_whileLoop {

    public static void main(String[] args) {
        boolean check = true;
        int count = 0;

        while (count < 10){
            count++;
            if(count == 6)
                break; // rompe el flujo de ejecucion
                // continue;  // Salta el valor 6 y continua en la siguiente iteracion

                System.out.println("Hola mundo " + count);



        }
        System.out.println("Fin");

    }

    //    Crear metodos para mostrarlos en el paquete de Primera Entrega
    public static void Ejercicio6(){
        boolean check = true;
        int count = 0;

        while (count < 10){
            count++;
            if(count == 6)
                break; // rompe el flujo de ejecucion
            // continue;  // Salta el valor 6 y continua en la siguiente iteracion

            System.out.println("Hola mundo " + count);



        }
        System.out.println("Fin");
    }
}
