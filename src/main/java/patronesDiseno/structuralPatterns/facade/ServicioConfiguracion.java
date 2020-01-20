package patronesDiseno.structuralPatterns.facade;


public class ServicioConfiguracion {

	public void addEmail(String cliente, String email) {
		BBDD.INSTANCE.setEmail(cliente, email);
	}

	
}
