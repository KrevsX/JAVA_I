package Third_Phase_POO;

public class TryCatchMain {

    public static void main(String[] args) {

        try{
            int result = 5 / 5;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de Recursos");
        }


        System.out.println("fin");
    }

    public static void Ejercicio19(){


        try{
            int result = 5 / 5;
        }catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de Recursos");
        }


        System.out.println("fin");
    }
}
