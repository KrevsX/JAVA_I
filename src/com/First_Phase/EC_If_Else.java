package com.First_Phase;

public class EC_If_Else {
    public static void main(String[] args) {

        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;

        if(number1 < number2 && number2 < number3){
            System.out.println("Verdadero");
        }else if (number3 < number4){
            System.out.println("FALSO");
        }else{

        }
        System.out.println("FIN");
    }

    //    Crear metodos para mostrarlos en el paquete de Primera Entrega
    public static void Ejercicio5(){
        boolean check = 5 < 10;
        int number1 = 50;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;
        if(number1 < number2 && number2 < number3){
            System.out.println("Verdadero");
        }else if (number3 < number4){
            System.out.println("Else If");
        }else{

        }
        System.out.println("FIN");
    }


}
