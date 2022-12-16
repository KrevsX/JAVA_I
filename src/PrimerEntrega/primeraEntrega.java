package PrimerEntrega;

import Second_Phase_POO.Interfaces.InterfaceMain;
import Second_Phase_POO.PolimorfismoMain;
import Second_Phase_POO.VehiculoMain;
import Third_Phase_POO.*;
import com.First_Phase.*;

import java.util.Scanner;


public class primeraEntrega {

    public static void main(String[] args) throws NameFormatException {

      /*Introduccion();
        EstructurasControl();
        TiposFunciones();
      */

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n           ++++SELECCIONA UNA OPCION++++ \n" +
                    "--------------------------------------------------------\n" +
                    "[1] Introduccion        |        [2] Estructuras Control\n" +
                    "[3] Tipos Funciones     |        [4] Interfaces\n" +
                    "[5] Herencia            |        [6] Polimorfismo\n" +
                    "[7] Arrays              |        [8] List\n" +
                    "[9] Map                 |        [10] Scanner\n" +
                    "[11] Strings            |        [20] Throw and Throws\n" +
                    "[13] Tipos Funciones    |        [14] Salir\n");
            System.out.println("Selecciona una Opcion: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Introduccion();
                    break;

                case 2:
                    EstructurasControl();
                    break;

                case 3:
                    TiposFunciones();
                    break;

                case 4:
                    Interfaces();
                    break;

                case 5:
                    Herencia();
                    break;

                case 6:
                    Polimorfismo();
                    break;

                case 7:
                    Arrays();
                    break;

                case 8:
                    List();
                    break;

                case 9:
                    Map();
                    break;

                case 10:
                    Scanner();
                    break;
                case 11:
                    Strings();
                    break;
                case 12:
                    ThrowThrows();
                    break;
                case 13:
                    TryCatch();
                    break;
                default:
                    System.out.println("Haz Ingresado un Valor no Valido" +
                            "Intentalo Nuevamente");
            }
            if (opcion == 14) {
                break;
            }
        }

    }
    public static void Introduccion() {

        System.out.println("Introduccion\n");
        Helloworld.Ejericicio1();
        ByeWorld.Ejercicio2();
        Comentarios.Ejercicio3();

    }
    public static void EstructurasControl() {

        System.out.println("Estructuras Control\n");
        EC_For.Ejercicio4();
        EC_If_Else.Ejercicio5();
        EC_whileLoop.Ejercicio6();
        Switch_Case.Ejercicio7();
    }
    public static void TiposFunciones() {

        System.out.println("Tipos Funciones\n");
        Funciones.Ejercicio8();
        Sobrecarga_Funciones.Ejercicio9();

    }

    public static void Interfaces() {

        System.out.println("Interfaces\n");
        InterfaceMain.Ejercicio10();
    }

    public static void Herencia(){

        System.out.println("Herencia\n");
        VehiculoMain.Ejercicio11();
    }

    public static void Polimorfismo(){

        System.out.println("Polimorfismo\n");
        PolimorfismoMain.Ejercicio12();
    }
    public static void Arrays(){

        System.out.println("Arrays - Arreglos\n");
        ArraysMain.Ejercicio13();
    }
    public static void List(){

        System.out.println("List = Listas\n");
        ListMain.Ejercicio14();
    }
    public static void Map(){

        System.out.println("Map = Mapas\n");
        MapMain.Ejercicio15();
    }

    public static void Scanner(){

        System.out.println("Scanner = Captura de Datos por Consola\n");
        ScannerMain.Ejercicio16();
    }

    public static void Strings(){

        System.out.println("Manipulacion de Strings\n");
        StringMain.Ejercicio17();
    }
    public static void ThrowThrows() throws NameFormatException {

        System.out.println("Manipulacion de Excepciones\n");
        ThrowMain.Ejercicio18();
    }

    public static void TryCatch(){

        System.out.println("Try = Catch\n");
        TryCatchMain.Ejercicio19();
    }

}
