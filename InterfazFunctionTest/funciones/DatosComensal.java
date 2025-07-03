package funciones;

import pojos.Comensal;

public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Javier", 256.2, 5);

        String nombreCom = (String)getDatosComensal(com1, x -> x.getNombre());
        int mesa = (int)getDatosComensal(com1, x -> x.getMesa());

        System.out.println("El nombre del comensal es: " + nombreCom);
        System.out.println("La mesa del comensal es: " + mesa);
    }

    public static Object getDatosComensal(Comensal com, Function<Comensal, Object> funcion) {
        return funcion.apply(com);
    }
}