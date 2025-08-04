package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew {
    public static void main(String[] args) {
        List<String> numeros = 
            Arrays.asList("10", "10", "15", "15", "25", "30", "40", "6", "30");

        //List<Integer> resultados = getResults(numeros, (numeroEnString) -> new Integer(numeroEnString));

        getResults(numeros, Integer::new).forEach(EjercicioNew::multiplicaPor10);

        
    }

    public static List<String> getResults(List<String> datos, Function<String, Integer> func) {

        List<Integer> resultados = new ArrayList<>();

        datos.forEach(strNum -> resultados.add(func.apply(strNum)));

        return resultados;
    }

    public static void multiplicaPor10(int numero) {
        System.out.println("El nuevo valor del dato " + numero + " es " + (numero * 10));
    }
}