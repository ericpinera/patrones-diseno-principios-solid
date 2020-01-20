package patronesDiseno.structuralPatterns.decorator.example1;

import java.util.List;

public interface BaseDatos {

	void inserta(String registro);
	
	List<String> registros();
}
