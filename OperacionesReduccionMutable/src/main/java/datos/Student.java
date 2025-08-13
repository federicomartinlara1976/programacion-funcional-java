package datos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
	
	private String surname;
    
	private String city;
    
	private double avgGrade;
    
	private int age;
    
    @Override
    public String toString() {
        return "Student{name="  + name + "}";
    }
    
    public Boolean calificacionExcelente() {
    	return (avgGrade >= 8.0);
    }
}
