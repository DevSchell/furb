import org.junit.jupiter.api.Test;
import unidade03.exercicios.lista08.ProjetoPrivado;
import unidade03.exercicios.lista08.TipoArea;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProjetoPrivadoTest {

    @Test
    public void criacaoValidaEResumo() {
        ProjetoPrivado p = new ProjetoPrivado();
        p.setNumero(201);
        p.setTipoArea(TipoArea.AREA_URBANA);
        p.setMetragem(150.5);

        assertEquals(150.5, p.getMetragem());
        // assertTrue(p.getResumo().contains("AREA_URBANA"));
        //TODO: tirar dúvida sobre essa assertion
    }

    @Test
    public void metragemInvalida() {
        ProjetoPrivado p = new ProjetoPrivado();
        p.setMetragem(-10.0);

        assertEquals(-10.0, p.getMetragem());
    }

}
