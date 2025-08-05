package funciones;

import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;
import pojos.Comensal;

@Slf4j
public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Javier", 256.2, 5);

        String nombreCom = (String)getDatosComensal(com1, x -> x.getNombre());
        int mesa = (int)getDatosComensal(com1, x -> x.getMesa());

        log.info("El nombre del comensal es: {}", nombreCom);
        log.info("La mesa del comensal es: {}", mesa);
    }

    public static Object getDatosComensal(Comensal com, Function<Comensal, Object> funcion) {
        return funcion.apply(com);
    }
}