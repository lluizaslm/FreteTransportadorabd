package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.TipoVeiculo;

import java.util.List;

public class TipoVeiculoRepository {

    private final EntityManager manager;
    private final DAOGenerico<TipoVeiculo> daoGenerico;

    public TipoVeiculoRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public TipoVeiculo buscarPorId(Long id) {
        return daoGenerico.buscaPorId(TipoVeiculo.class, id.intValue());
    }

    public List<TipoVeiculo> buscarTodos() {
        return daoGenerico.buscarTodos(TipoVeiculo.class);
    }

    public TipoVeiculo salvar(TipoVeiculo tipoVeiculo) {
        return daoGenerico.salvar(tipoVeiculo);
    }

    public TipoVeiculo atualizar(TipoVeiculo tipoVeiculo) {
        return daoGenerico.atualizar(tipoVeiculo);
    }

    public void remover(TipoVeiculo tipoVeiculo) {
        daoGenerico.remove(tipoVeiculo);
    }
}
