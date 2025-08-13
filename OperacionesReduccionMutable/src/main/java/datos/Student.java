package datos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String name;
    
	private int age;
    
	private double grade;
    
	private String subject;
    
    @Override
    public String toString() {
        return String.format("%s (%d años, %.1f, %s)", name, age, grade, subject);
    }
}
