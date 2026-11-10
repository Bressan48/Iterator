package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColetaTest {

    @Test
    void deveContarRepositoresAtivosSetor() {
        Setor setor = new Setor(
                new Repositor("Marco", true),
                new Repositor("Antonio", true),
                new Repositor("Jose", false),
                new Repositor("Maria", true)
        );
        assertEquals(3, Coleta.contarRepositoresAtivosSetor(setor));
    }

    @Test
    void deveContarTotalRepositoresSetor() {
        Setor setor = new Setor(
                new Repositor("Marco", true),
                new Repositor("Antonio", true),
                new Repositor("Jose", false),
                new Repositor("Maria", true)
        );
        assertEquals(4, Coleta.contarTotalRepositoresSetor(setor));
    }

}
