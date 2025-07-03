package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[][] arreglo = {{"Chris", "USA"}, {"Raju", "India"}, {"Lynda", "Canada"}};

        // Crear mapa usando el array
        for(int i = 0; i < arreglo.length; i++) {
            map.put(arreglo[i][0], arreglo[i][1]);
        }

        Imprimir mapa forma tradicional
        System.out.println("Usando la forma tradicional de imprimir clave y valor de un mapa:");
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        if(iter!=null) {
            while(iter.hasNext()) {
                Map.Entry<String, Integer> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + " - Valor: " + entry.getValue());
            }
        }

        // Imprimir mapa usando la forma moderna de imprimir clave y valor de un mapa
        System.out.println("Usando BiConsumer y expresion lambda:");
        map.forEach((key, value) -> System.out.println("Clave: " + key + " - Valor: " + value));
    }
}