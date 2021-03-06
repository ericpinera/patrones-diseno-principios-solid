package srp;

import org.junit.Assert;
import org.junit.Test;
import srp.BBDD;
import srp.ExportadorCSV;
import srp.Pelicula;
import srp.Recomendador;

import java.util.List;

public class TestRecomendador {
    @Test
    public void test() {
        Recomendador r = new Recomendador();

        List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);

        Assert.assertFalse(recomenaciones.contains(BBDD.ET));
    }

    @Test
    public void test_formato() {
        Recomendador r = new Recomendador();

        String csv =  new ExportadorCSV().exportar(r.recomendaciones(BBDD.JUAN));

        String esperado = "Salvar al soldado Ryan,Spielberg,belico";

        Assert.assertEquals(esperado, csv);

    }
}
