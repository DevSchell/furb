import org.junit.jupiter.api.Test;
import unidade03.exercicios.lista08.Profissional;
import unidade03.exercicios.lista08.Projeto;
import unidade03.exercicios.lista08.TipoProjeto;

import static org.junit.jupiter.api.Assertions.*;

public class ProfissionalTest {

    @Test
    public void atribuicaoValidaDeDados() {
        Profissional p1 = new Profissional();
        p1.setCpf("12345678900");
        p1.setNome("João Silva");

        assertEquals("12345678900", p1.getCpf());
        assertEquals("João Silva", p1.getNome());
    }

    @Test
    public void atribuicaoDadosNulosOuVazios() {
        Profissional p1 = new Profissional();
        p1.setNome(null);
        p1.setCpf("");

        assertNull(p1.getNome());
        assertEquals("", p1.getCpf());
    }

    @Test
    public void adicionarProjeto() {
        Profissional p1 = new Profissional();
        Projeto prj = new Projeto() {

            @Override
            public TipoProjeto getTipoProjeto() {
                return null;
            }

            @Override
            public String getResumo() {
                return "";
            }
        };

        p1.adicionaProjeto(prj);

        assertEquals(1, p1.getProjetos().size());
        assertTrue(p1.getProjetos().contains(prj));
    }

}
