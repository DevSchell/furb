import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import unidade03.exercicios.lista08.Projeto;
import unidade03.exercicios.lista08.ProjetoPrivado;
import unidade03.exercicios.lista08.Sistema;
import unidade03.exercicios.lista08.TipoArea;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SistemaTest {

    // CT01: Registrar empreendimento com dados válidos
    //Resultado esperado: Empreendimento adicionado à lista, data preenchida, NENHUMA exceção lançada
    @Test
    public void adicionarEmpreendimentosComCampos() {
        Sistema sistema = new Sistema();
        ArrayList<String> cpfResponsaveis = new ArrayList<String>();
        cpfResponsaveis.add("1");

        String nomeEsperado = "Residencial Primavera";
        double metragemEsperada = 1200.5;

        try {
            sistema.adicionarProjetoPrivado(
                    nomeEsperado,
                    cpfResponsaveis,
                    metragemEsperada,
                    TipoArea.AREA_URBANA
            );
        } catch (Exception e) {
            fail("Nenhuma exceção deveria ter sido lançada no CT01 com dados válidos");
        }

        ArrayList<Projeto> projetosAdicionados = sistema.getProjetos();

        // Resultado esperado #1: O empreendimento é adicionado à lista
        assertNotNull("A lista de projetos não deve ser nula.", projetosAdicionados);
        assertEquals("A lista deve conter exatamente 1 projeto após a edição.", 1, projetosAdicionados.size());

        Projeto projetoAdicionado = projetosAdicionados.getFirst();

        // Verificando dados
        assertEquals("Residencial Primavera", projetoAdicionado.getDescricao());

        // Resultado esperado #2: dataEntrada é preenchida com a data atual
        assertNotNull("O campo de dataInclusao não deve ser nulo (deve ser preenchido).", projetoAdicionado.getDataInclusao());

        // Resultado esperado #2.1: A dataEntrada é uma data atual
        assertTrue("A data de inclusão deve ser a data atual (hoje).", ((LocalDate) projetoAdicionado.getDataInclusao()).isEqual(LocalDate.now()));

    }

    // CT02: Impedir registros sem localização
    // Resultado esperado: DEVE lançar exceção IllegalArgumentException com mensagem "Localização obrigatória"
    @Test
    public void impedirRegistroSemLocalizacao() {
        Sistema sistema = new Sistema();
        ArrayList<String> cpfResponsaveis = new ArrayList<>();
        cpfResponsaveis.add("1");

        TipoArea localizacaoInvalida = null;
        String mensagemEsperada = "Localização obrigatória";

        try {
            sistema.adicionarProjetoPrivado(
                    "Residencial Jardim",
                    cpfResponsaveis,
                    900,
                    localizacaoInvalida
            );

            fail("O registro SEM localização deveria ter lançado um IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            // PASSA 1: Verifica se mensagem da exception está correta
            assertEquals("A mensagem de exceção lançada está correta", mensagemEsperada, e.getMessage());


        } catch (Exception e) {
            fail("Uma exceção do tipo errado foi lançada. Era esperado IllegalArgumentException, mas foi lançado: " + e.getClass().getName());
        }

    }

}
