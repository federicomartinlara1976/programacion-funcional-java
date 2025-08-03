package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {
    
	private String identificacion;
    
	private int edad;
    
	private double altura;
    
	private double promedio;
}
