package datos;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado implements Comparable<Empleado> {
    
	private long id;
    
	private String nombre;
    
	private double ingresos;
    
	private int edad;
    
	private Genero genero;

    public static enum Genero {
        HOMBRE, MUJER
    }

    @Override
    public int compareTo(Empleado emp) {
        return this.nombre.compareTo(emp.nombre);
    }

    public static List<Empleado> empleados() {
    	Empleado emp1 = new Empleado(1, "Juan Perez", 538.00, 26, Genero.HOMBRE);
    	Empleado emp2 = new Empleado(2, "Alicia Ramírez", 600.00, 38, Genero.MUJER);
    	Empleado emp3 = new Empleado(3, "Juan Puga", 900.00, 36, Genero.HOMBRE);
    	Empleado emp4 = new Empleado(4, "Javier Vazquez", 330.00, 36, Genero.HOMBRE);
    	Empleado emp5 = new Empleado(5, "Hevelyn López", 450.00, 36, Genero.MUJER);
    	Empleado emp6 = new Empleado(6, "Esmeralda López", 450.00, 38, Genero.MUJER);
    	Empleado emp7 = new Empleado(7, "Oyuky Navarro", 600.00, 38, Genero.MUJER);
    	Empleado emp8 = new Empleado(8, "Álvaro Mejía", 450.50, 22, Genero.HOMBRE);
    	Empleado emp9 = new Empleado(9, "Olivia Suarez", 652.30, 38, Genero.MUJER);
    	Empleado emp10 = new Empleado(10, "Jessica Quevedo", 584.22, 38, Genero.MUJER);
    	Empleado emp11 = new Empleado(11, "Oswaldo Sánchez", 789.48, 42, Genero.HOMBRE);
    	Empleado emp12 = new Empleado(12, "Oscar Pérez", 155.78, 45, Genero.HOMBRE);
    	Empleado emp13 = new Empleado(13, "Lionel Messi", 321.12, 26, Genero.HOMBRE);
    	Empleado emp14 = new Empleado(14, "Ricardo Kaká", 796.36, 32, Genero.HOMBRE);
    	Empleado emp15 = new Empleado(15, "Cristiano Ronaldo", 122.87, 30, Genero.HOMBRE);
    	Empleado emp16 = new Empleado(16, "Andrés Iniesta", 798.23, 33, Genero.HOMBRE);
    	Empleado emp17 = new Empleado(17, "Eva Perón", 613.25, 40, Genero.MUJER);
    	Empleado emp18 = new Empleado(18, "Margarita Zavala", 321.54, 54, Genero.MUJER);
    	Empleado emp19 = new Empleado(19, "Josefina Vázquez", 821.48, 50, Genero.MUJER);
    	Empleado emp20 = new Empleado(20, "Patricia Zetina", 432.55, 49, Genero.MUJER);
    	Empleado emp21 = new Empleado(21, "Loammi Vazquez", 158.00, 26, Genero.HOMBRE);
    	Empleado emp22 = new Empleado(22, "David Isaí", 464.48, 30, Genero.HOMBRE);
    	Empleado emp23 = new Empleado(23, "Absalón Montreal", 125.45, 20, Genero.HOMBRE);
    	Empleado emp24 = new Empleado(24, "Ruth Sabiñon", 215.12, 22, Genero.MUJER);
    	Empleado emp25 = new Empleado(25, "Lorenzo Arano", 545.15, 26, Genero.HOMBRE);
    	Empleado emp26 = new Empleado(26, "Horacio Cervantes", 145.54, 45, Genero.HOMBRE);
    	Empleado emp27 = new Empleado(27, "Julio Batista", 558.45, 24, Genero.HOMBRE);
    	Empleado emp28 = new Empleado(28, "Edmundo Aguilar", 876.15, 38, Genero.HOMBRE);
    	Empleado emp29 = new Empleado(29, "Ángel Marquez", 897.55, 38, Genero.HOMBRE);
    	Empleado emp30 = new Empleado(30, "Martha Sahagún", 124.45, 50, Genero.MUJER);
    	Empleado emp31 = new Empleado(31, "Vicente Fox", 515.45, 60, Genero.HOMBRE);
    	Empleado emp32 = new Empleado(32, "Roberto Pintado", 287.54, 59, Genero.HOMBRE);
    	Empleado emp33 = new Empleado(33, "Alicia Villareal", 872.54, 45, Genero.MUJER);
    	Empleado emp34 = new Empleado(34, "Lola Beltrán", 245.77, 26, Genero.MUJER);

        return Arrays.asList(emp1, emp2, emp3, emp4, emp5, 
                emp6, emp7, emp8, emp9, emp10, emp11, emp12, emp13, emp14, 
                emp15, emp16, emp17, emp18, emp19, emp20, emp21, emp22, 
                emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30, 
                emp31, emp32, emp33, emp34);
    }
    
}