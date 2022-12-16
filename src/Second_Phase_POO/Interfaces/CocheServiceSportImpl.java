package Second_Phase_POO.Interfaces;

import Second_Phase_POO.CocheElectrico;

import Second_Phase_POO.Vehiculos;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Vehiculos crearCocheDemo() {
        System.out.println("Creando Coche de Carreras");
        return new CocheElectrico();
    }

    @Override
    public void detruirCoche(Vehiculos Vehiculos) {
        System.out.println("Destruyendo Coche");

    }
}



