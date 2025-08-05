package funciones;

import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;
import pojos.Comensal;

@Slf4j
public class DatosComensal {
    public static void main(String[] args) {
        Comensal comensal = new Comensal("Javier", 256.2, 5);

        String nombreComensal = (String)getDatosComensal(comensal, x -> x.getNombre());
        Integer mesa = (Integer) getDatosComensal(comensal, x -> x.getMesa());

        log.info("El nombre del comensal es: {}", nombreComensal);
        log.info("La mesa del comensal es: {}", mesa);
    }

    public static Object getDatosComensal(Comensal comensal, Function<Comensal, Object> funcion) {
        return funcion.apply(comensal);
    }
}