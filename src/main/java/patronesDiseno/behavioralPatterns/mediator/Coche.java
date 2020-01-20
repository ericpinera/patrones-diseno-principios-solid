package patronesDiseno.behavioralPatterns.mediator;

public class Coche {

	private Coordinador coordinador;
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}

	public void enciende() {
		coordinador.enciendeCoche();
	}
	
	public void apaga() {
		coordinador.apagaCoche();
	}
	
}
