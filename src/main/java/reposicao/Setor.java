package reposicao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Setor implements Iterable<Repositor>{

    private List<Repositor> repositores = new ArrayList<Repositor>();

    public Setor(Repositor... repositores) {
        this.repositores = Arrays.asList(repositores);
    }

    @Override
    public Iterator<Repositor> iterator() {
        return repositores.iterator();
    }

}


