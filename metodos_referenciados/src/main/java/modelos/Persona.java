package modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {
    
	private String nombre;
    
	private Integer edad;
    
	private String email;

    public int compararPorEdad2(Persona per) {
        return this.getEdad().compareTo(per.getEdad());
    }
    
    public static int compararPorEdad(Persona a, Persona b) {
        return a.getEdad().compareTo(b.getEdad());
    }
}