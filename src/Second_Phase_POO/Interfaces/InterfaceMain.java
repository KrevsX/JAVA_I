package Second_Phase_POO.Interfaces;

import Second_Phase_POO.Vehiculos;

public class InterfaceMain {

    public static void main(String[] args) {


        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Vehiculos coche1 = service1.crearCocheDemo();
        Vehiculos coche2 = service2.crearCocheDemo();
    }

    public static void Ejercicio10(){

        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Vehiculos coche1 = service1.crearCocheDemo();
        Vehiculos coche2 = service2.crearCocheDemo();
    }
}
