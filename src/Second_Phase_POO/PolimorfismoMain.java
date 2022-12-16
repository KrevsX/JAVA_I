package Second_Phase_POO;

public class PolimorfismoMain {
    public static void main(String[] args) {

        Vehiculos vehiculos1 = new Vehiculos();

        CocheElectrico vehiculos2 = new CocheElectrico();

        CocheHibrido vehiculos3 = new CocheHibrido();

        // POLIMORFISMO_MAIN

        Vehiculos vehiculos4 = new CocheElectrico();

        Vehiculos vehiculos5 = new CocheHibrido();

        if(vehiculos4 instanceof Vehiculos){
            System.out.println("Vehiculos");
        }

        if (vehiculos4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }

        if(vehiculos4 instanceof  CocheHibrido){
            System.out.println("Coche Hibrido");
        }
    }

    public static void Ejercicio12(){

        Vehiculos vehiculos1 = new Vehiculos();

        CocheElectrico vehiculos2 = new CocheElectrico();

        CocheHibrido vehiculos3 = new CocheHibrido();

        // POLIMORFISMO_MAIN

        Vehiculos vehiculos4 = new CocheElectrico();

        Vehiculos vehiculos5 = new CocheHibrido();

        if(vehiculos4 instanceof Vehiculos){
            System.out.println("Vehiculos");
        }

        if (vehiculos4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }

        if(vehiculos4 instanceof  CocheHibrido){
            System.out.println("Coche Hibrido");
        }
    }
}
