package Third_Phase_POO;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("1232131H", "Nombre Apellido 1");
        personas.put("6645ASDF", "Nombre Apellido 2");
        personas.put("J9R98NLM", "Nombre Apellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()){
            System.out.println(key);
        }

        for(String value : personas.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " // " + pair.getValue());
        }
    }

    public static void Ejercicio15(){


        Map<String, String> personas = new HashMap<>();

        personas.put("1232131H", "Nombre Apellido 1");
        personas.put("6645ASDF", "Nombre Apellido 2");
        personas.put("J9R98NLM", "Nombre Apellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()){
            System.out.println(key);
        }

        for(String value : personas.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " // " + pair.getValue());
        }
    }
}
