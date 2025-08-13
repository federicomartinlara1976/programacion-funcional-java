package exceptions;

public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = -1710180715597574718L;
	
	public EmployeeNotFoundException(String termino) {
		super("No se encontró el empleado solicitado con el término " + termino);
	}

}
