package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Cidade;

import java.util.List;

public class CidadeRepository {

    private final EntityManager manager;
    private final DAOGenerico<Cidade> daoGenerico;

    public CidadeRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Cidade buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Cidade.class, id.intValue());
    }

    public List<Cidade> buscarTodos() {
        return daoGenerico.buscarTodos(Cidade.class);
    }

    public Cidade salvar(Cidade cidade) {
        return daoGenerico.salvar(cidade);
    }

    public Cidade atualizar(Cidade cidade) {
        return daoGenerico.atualizar(cidade);
    }

    public void remover(Cidade cidade) {
        daoGenerico.remove(cidade);
    }
}
