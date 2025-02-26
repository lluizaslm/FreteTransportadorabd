package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.models.Cliente;

import java.util.List;

public class FreteRepository {

    private final EntityManager manager;
    private final DAOGenerico<Frete> daoGenerico;

    public FreteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Frete buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Frete.class, id.intValue());
    }

    public List<Frete> buscarTodos() {
        return daoGenerico.buscarTodos(Frete.class);
    }

    public Frete salvar(Frete frete) {
        return daoGenerico.salvar(frete);
    }

    public Frete atualizar(Frete frete) {
        return daoGenerico.atualizar(frete);
    }

    public void remover(Frete frete) {
        daoGenerico.remove(frete);
    }

    public List<Frete> buscarTodosPorCliente(Cliente cliente) {
        TypedQuery<Frete> query = manager.createQuery(
                "SELECT f FROM Frete f WHERE f.cliente = :cliente", Frete.class);
        query.setParameter("cliente", cliente);
        return query.getResultList();
    }
}
