package utilerias;

import modelos.Persona;

public class ProveedorComparaciones {

    public int compararPorNombre(Persona per1, Persona persona2) {
        return per1.getNombre().compareTo(persona2.getNombre());
    }

    public static int compararPorEdad(Persona per1, Persona per2) {
        return per1.getEdad().compareTo(per2.getEdad());
    }

    // public int compararPorEmail(Persona a, Persona b) {
    //     return a.getEmail().compareTo(b.getEmail());
    // }
}