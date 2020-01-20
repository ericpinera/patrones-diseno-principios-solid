package patronesDiseno.creationalPatterns.abstractFactory;

public class PreguntasEs implements Preguntas {

    @Override
    public String preguntaHora() {
        return "¿qué hora es?";
    }

    @Override
    public String preguntaTiempo() {
        return "¿qué tiempo hace?";
    }

}
