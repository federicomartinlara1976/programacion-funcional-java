package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comensal {
    
	private String nombre;
    
	private double montoPedido;
    
	private int mesa;

}