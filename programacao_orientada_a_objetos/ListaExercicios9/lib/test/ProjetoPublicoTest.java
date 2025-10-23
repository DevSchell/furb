import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import unidade03.exercicios.lista08.Profissional;
import unidade03.exercicios.lista08.ProjetoPublico;

import java.time.LocalDate;

public class ProjetoPublicoTest {

    @Test
    public void criacaoValidaEDuracao() {
        ProjetoPublico p = new ProjetoPublico();
        LocalDate dataInicio = LocalDate.of(2023, 1, 1);
        LocalDate dataFim = LocalDate.of(2023, 1, 31);

        p.setNumero(101);
        p.setDataInicio(dataInicio);
        p.setDataFim(dataFim);

        Assertions.assertEquals(30, p.getDuracao());
        Assertions.assertTrue(p.getResumo().contains("30 dias"));
    }

    @Test
    public void adicionarResponsavelDuplicado() {
        final ProjetoPublico p = new ProjetoPublico();
        p.setNumero(102);

        final Profissional prof1 = new Profissional();
        prof1.setCpf("111");

        final String mensagemEsperada = "Profissional já registrado para o projeto: 102";

        p.adicionarResponsavel(prof1);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> p.adicionarResponsavel(prof1)
        );

        Assertions.assertEquals(mensagemEsperada, exception.getMessage());

    }

}
