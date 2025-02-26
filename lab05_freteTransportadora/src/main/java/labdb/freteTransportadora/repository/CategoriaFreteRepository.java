package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import labdb.freteTransportadora.models.CategoriaFrete;
import java.util.List;

public class CategoriaFreteRepository {

    private final EntityManager manager;
    private final DAOGenerico<CategoriaFrete> daoGenerico;

    public CategoriaFreteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public CategoriaFrete buscarPorId(Long id) {
        return daoGenerico.buscaPorId(CategoriaFrete.class, id.intValue());
    }

    public List<CategoriaFrete> buscarTodos() {
        return daoGenerico.buscarTodos(CategoriaFrete.class);
    }

    public CategoriaFrete criar(CategoriaFrete categoriaFrete) {
        return daoGenerico.salvar(categoriaFrete);
    }

    public CategoriaFrete atualizar(CategoriaFrete categoriaFrete) {
        return daoGenerico.atualizar(categoriaFrete);
    }

    public void remover(CategoriaFrete categoriaFrete) {
        daoGenerico.remove(categoriaFrete);
    }
}
