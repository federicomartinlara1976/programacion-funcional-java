package funciones;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import pojos.Comensal;

@Slf4j
public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensales =
            Arrays.asList(
                new Comensal("Javier", 10.0, 5),
                new Comensal("Arturo", 10.0, 5),
                new Comensal("Mario", 10.0, 5),
                new Comensal("Aguila", 10.0, 5),
                new Comensal("Lo que sea", 10.0, 5),
                new Comensal("Cambio", 10.0, 5)
            );

        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());

        log.info("La lista de comensales es la siguiente:");
        nombresComensales.forEach(comensal -> log.info("El nombre del comensal es: {}", comensal)); 

        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMontoPedido());

        log.info("La lista de montos de comensales es la siguiente:");
        montosComensales.forEach(montoComensal -> log.info("El monto del comensal es: {}", montoComensal)); 
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> funcion) {
    	return listaCom.parallelStream()
                .map(funcion)
                .toList();
    }
}