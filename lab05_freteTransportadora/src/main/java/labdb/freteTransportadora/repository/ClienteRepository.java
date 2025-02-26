package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Cliente;
import java.util.List;

public class ClienteRepository {
    private final DAOGenerico<Cliente> dao;

    public ClienteRepository(EntityManager entityManager) {
        this.dao = new DAOGenerico<>(entityManager);
    }

    public List<Cliente> buscarTodos() {
        return dao.buscarTodos(Cliente.class);
    }

    public Cliente buscaPorId(Integer id) {
        return dao.buscaPorId(Cliente.class, id);
    }

    public Cliente salvar(Cliente cliente) {
        return dao.salvar(cliente);
    }

    public Cliente atualizar(Cliente cliente) {
        return dao.atualizar(cliente);
    }

    public void remover(Cliente cliente) {
        dao.remove(cliente);
    }
}
