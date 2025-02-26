package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Filial;

import java.util.List;

public class FilialRepository {

    private final EntityManager manager;
    private final DAOGenerico<Filial> daoGenerico;

    public FilialRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Filial buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Filial.class, id.intValue());
    }

    public List<Filial> buscarTodos() {
        return daoGenerico.buscarTodos(Filial.class);
    }

    public Filial salvar(Filial filial) {
        return daoGenerico.salvar(filial);
    }

    public Filial atualizar(Filial filial) {
        return daoGenerico.atualizar(filial);
    }

    public void remover(Filial filial) {
        daoGenerico.remove(filial);
    }
}
