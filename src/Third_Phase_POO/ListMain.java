package Third_Phase_POO;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres){
            System.out.println(nombre);

        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Honda Civic"));
        coches.add(new Coche("Alfa Romeo"));
        coches.add(new Coche("Ford Mustang"));
        coches.add(new Coche("Mazda RX7"));

        System.out.println(coches);

        for (Coche coche : coches){
            System.out.println(coche);
        }


    }

    public static void Ejercicio14(){

        List<String> nombres = new ArrayList<>();

        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres){
            System.out.println(nombre);

        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Honda Civic"));
        coches.add(new Coche("Alfa Romeo"));
        coches.add(new Coche("Ford Mustang"));
        coches.add(new Coche("Mazda RX7"));

        System.out.println(coches);

        for (Coche coche : coches){
            System.out.println(coche);
        }

    }
}
