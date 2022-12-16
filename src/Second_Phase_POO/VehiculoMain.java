package Second_Phase_POO;

public class VehiculoMain {

    public static void main(String[] args) {


        Vehiculos vehicle = new CocheElectrico("motor", "rojo", "honda", "civic", 1430.45, 5.4);

        vehicle.acelerar(50);

        System.out.println(vehicle);

        vehicle.peso = 1350.9;

        System.out.println(vehicle);

        CocheElectrico coche_electrico = new CocheElectrico();

        coche_electrico.motorElectrico = "Ejemplo Motor";
        coche_electrico.color = "Verde";
        coche_electrico.fabricante = "Honda";
        coche_electrico.modelo = "Civic";

        System.out.println(coche_electrico);

        CocheElectrico coche_electrico2 = new CocheElectrico("TXZ", "AZUL", "ALFA", "ROMERO", 1500d, 4.99);

        System.out.println(coche_electrico2);

        coche_electrico2.acelerar(50);

        System.out.println(coche_electrico2);

    }

    public static void Ejercicio11(){


        Vehiculos vehicle = new CocheElectrico("motor", "rojo", "honda", "civic", 1430.45, 5.4);

        vehicle.acelerar(50);

        System.out.println(vehicle);

        vehicle.peso = 1350.9;

        System.out.println(vehicle);

        CocheElectrico coche_electrico = new CocheElectrico();

        coche_electrico.motorElectrico = "Ejemplo Motor";
        coche_electrico.color = "Verde";
        coche_electrico.fabricante = "Honda";
        coche_electrico.modelo = "Civic";

        System.out.println(coche_electrico);

        CocheElectrico coche_electrico2 = new CocheElectrico("TXZ", "AZUL", "ALFA", "ROMERO", 1500d, 4.99);

        System.out.println(coche_electrico2);

        coche_electrico2.acelerar(50);

        System.out.println(coche_electrico2);


    }
}
