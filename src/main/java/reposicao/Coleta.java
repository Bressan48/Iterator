package reposicao;

import java.util.Iterator;

public class Coleta {

    public static Integer contarRepositoresAtivosSetor(Setor setor) {
        int quantidade = 0;
        for (Repositor repositor : setor) {
            if (repositor.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalRepositoresSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator a = setor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
