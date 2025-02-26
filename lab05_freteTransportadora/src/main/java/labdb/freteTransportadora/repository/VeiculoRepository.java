package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Veiculo;

import java.util.List;

public class VeiculoRepository {

    private final EntityManager manager;
    private final DAOGenerico<Veiculo> daoGenerico;

    public VeiculoRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Veiculo buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Veiculo.class, id.intValue());
    }

    public List<Veiculo> buscarTodos() {
        return daoGenerico.buscarTodos(Veiculo.class);
    }

    public Veiculo salvar(Veiculo veiculo) {
        return daoGenerico.salvar(veiculo);
    }

    public Veiculo atualizar(Veiculo veiculo) {
        return daoGenerico.atualizar(veiculo);
    }

    public void remover(Veiculo veiculo) {
        daoGenerico.remove(veiculo);
    }
}
