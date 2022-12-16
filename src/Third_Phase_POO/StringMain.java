package Third_Phase_POO;

public class StringMain {

    public static void main(String[] args) {

        // La clase String
        /*
        * length()
        * startsWith()
        * endsWith()
        * indexOf()
        * subString()
        * trim()
        * equals()*/

        String mensaje = "  Hola Mundo  ";
        System.out.println(mensaje.length());

        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "hola mundo";
        if(mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("VERDADERO");
        }

    }

    public static void Ejercicio17(){

        String mensaje = "  Hola Mundo  ";
        System.out.println(mensaje.length());

        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "hola mundo";
        if(mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("VERDADERO");
        }
    }
}
