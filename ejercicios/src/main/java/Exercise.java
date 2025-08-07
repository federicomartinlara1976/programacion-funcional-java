import java.util.*;
import java.util.function.*;

/**
 * EJERCICIO: Sistema de Procesamiento de Estudiantes
 * 
 * Implementa un sistema que procese información de estudiantes usando interfaces funcionales.
 * Debes completar todos los métodos usando las interfaces funcionales apropiadas.
 */
public class Exercise {
    
    // Clase interna Student (NO MODIFICAR)
    public static class Student {
        private String name;
        private int age;
        private double grade;
        private String subject;
        
        public Student(String name, int age, double grade, String subject) {
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.subject = subject;
        }
        
        public String getName() { return name; }
        public int getAge() { return age; }
        public double getGrade() { return grade; }
        public String getSubject() { return subject; }
        
        @Override
        public String toString() {
            return String.format("%s (%d años, %.1f, %s)", name, age, grade, subject);
        }
    }
    
    /**
     * 1. Crea un Supplier que genere un estudiante por defecto
     * Nombre: "Estudiante Anónimo", Edad: 18, Calificación: 0.0, Materia: "Sin asignar"
     * Pista: Recuerda que Supplier solamente devuelve algún valor.
     */
    public static Supplier<Student> createDefaultStudentSupplier() {
        Supplier<Student> s = () -> new Student("Estudiante Anónimo", 18, 0.0, "Sin asignar");
        return s;
    }
    
    /**
     * 2. Crea una Function que convierta el nombre del estudiante a mayúsculas
     * y agregue el prefijo "ESTUDIANTE: "
     * Ejemplo de lo que debe devolver: ESTUDIANTE ANA
     */
    public static Function<Student, String> createNameFormatter() {
        Function<Student, String> f = student -> "ESTUDIANTE: " + student.getName().toUpperCase();
        return f;
    }
    
    /**
     * 3. Crea un Predicate que determine si un estudiante es "destacado"
     * Un estudiante es destacado si tiene calificación >= 9.0 y edad <= 25
     * Pista: Crea la expresión lambda que el método test ejecutará.
     */
    public static Predicate<Student> createExcellentStudentPredicate() {
        // TODO: Implementar usando Predicate<Student>
        Predicate<Student> p = student -> student.getGrade() >= 9.0 && student.getAge() <= 25;
        return p;
    }
    
    /**
     * 4. Crea un BiPredicate que compare si dos estudiantes son de la misma materia
     * y tienen una diferencia de edad menor a 5 años
     */
    public static BiPredicate<Student, Student> createSimilarStudentsPredicate() {
        BiPredicate<Student, Student> bp = (s1, s2) -> s1.getSubject().equals(s2.getSubject()) 
                      && Math.abs(s1.getAge() - s2.getAge()) < 5;
        return bp;
    }
    
    /**
     * 5. Crea un Consumer que imprima la información del estudiante
     * en el formato: "Procesando: [nombre] - Calificación: [grade]"
     * Ejemplo: "Procesando: Ana - Calificación: 8.0"
     */
    public static Consumer<Student> createStudentProcessor() {
        Consumer<Student> c = student -> System.out.printf("Procesando: %s - Calificación: %.1f%n", 
                                      student.getName(), 
                                      student.getGrade());
        return c;
    }
    
    /**
     * 6. Crea un BiConsumer que compare dos estudiantes e imprima quién tiene mejor calificación
     * Formato: "[nombre1] vs [nombre2]: [ganador] tiene mejor calificación"
     * Si empatan: "[nombre1] vs [nombre2]: Empate"
     * 
     */
    public static BiConsumer<Student, Student> createStudentComparator() {
        // Implementar usando BiConsumer<Student, Student>
        return (student1, student2) -> {
            String name1 = student1.getName();
            String name2 = student2.getName();
            double grade1 = student1.getGrade();
            double grade2 = student2.getGrade();
            
            if (grade1 > grade2) {
                System.out.printf("%s vs %s: %s tiene mejor calificación%n", 
                            name1, name2, name1);
            } else if (grade2 > grade1) {
                System.out.printf("%s vs %s: %s tiene mejor calificación%n", 
                            name1, name2, name2);
            } else {
                System.out.printf("%s vs %s: Empate%n", name1, name2);
            }
        };
    }
    
    /**
     * 7. Crea un UnaryOperator que "mejore" la calificación de un estudiante
     * Si la calificación es menor a 6.0, súmale 1.0
     * Si es mayor o igual a 6.0, súmale 0.5
     * La calificación no puede exceder 10.0
     */
    public static UnaryOperator<Double> createGradeImprover() {
        return grade -> Math.min(grade + (grade < 6.0 ? 1.0 : 0.5), 10.0);
    }
    
    /**
     * 8. Crea un BinaryOperator que calcule el promedio de dos calificaciones
     */
    public static BinaryOperator<Double> createAverageCalculator() {
        return (grade1, grade2) -> (grade1 + grade2) / 2.0;
    }
}