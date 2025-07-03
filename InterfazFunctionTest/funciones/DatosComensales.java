package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import pojos.Comensal;

public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensales =
            Arrays.asList(
                new Comensal("Javier", 10, 5),
                new Comensal("Arturo", 10, 5),
                new Comensal("Mario", 10, 5),
                new Comensal("Aguila", 10, 5),
                new Comensal("Lo que sea", 10, 5),
                new Comensal("Cambio", 10, 5)
            );

        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());

        System.out.println("La lista de comensales es la siguiente:");
        for (Object nombreComensal : nombresComensales) {
            System.out.println("El nombre del comensal es: " + nombreComensal);
        }

        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMonto_pedido());

        System.out.println("La lista de montos de comensales es la siguiente:");
        for (Object montoComensal : montosComensales) {
            System.out.println("El monto del comensal es: " + montoComensal);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> funcion) {
        List<Object> listaDatos = new ArrayList<>();
        for (Comensal comensal : listaCom) {
            listaDatos.add(funcion.apply(comensal));
        }
        return listaDatos;
    }
}