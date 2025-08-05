package modelos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona implements Comparable<Persona>{
    
	private int idPersona;
    
	private String nombre;
    
	private Date fechaNacimiento;

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("persona{idPersona:%1s, nombre:%2s}", idPersona, nombre);
    }

    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }
}