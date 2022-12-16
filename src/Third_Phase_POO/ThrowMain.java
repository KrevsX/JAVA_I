package Third_Phase_POO;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try{
            Ejercicio18();
        }catch(NameFormatException e){
            e.printStackTrace();
        }
    }

    /**
     * metodo que lee nombres desde la consola y verifica que tengan
     * un minimo de 8 caracteres
     * @throws NameFormatException
     */
    public static void Ejercicio18() throws NameFormatException{

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while(teclado.hasNext()){
            System.out.println("Introduce un Nombre");
            String nombre = teclado.nextLine();
            System.out.println("El nombre ingresado es: "+ nombre);
            if(nombre.length() < 8){
                teclado.close();
                throw new NameFormatException("El nombre debe de tener minimo 8 caracteres");
            }
        }teclado.close();
    }

}
