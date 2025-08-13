package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	private String email;
	
	private String nombre;
	
	private String apellido;
	
	private String direccion;
	
	private String puesto;
}
