package Second_Phase_POO.Interfaces;

import Second_Phase_POO.CocheElectrico;

import Second_Phase_POO.Vehiculos;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Vehiculos crearCocheDemo() {
        System.out.println("Creando Coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public void detruirCoche(Vehiculos Vehiculos) {
        System.out.println("Destruyendo Coche");

    }
}
