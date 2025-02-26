package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Distancia;

import java.util.List;

public class DistanciaRepository {

    private final EntityManager manager;
    private final DAOGenerico<Distancia> daoGenerico;

    public DistanciaRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Distancia buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Distancia.class, id.intValue());
    }

    public List<Distancia> buscarTodos() {
        return daoGenerico.buscarTodos(Distancia.class);
    }

    public Distancia salvar(Distancia distancia) {
        return daoGenerico.salvar(distancia);
    }

    public Distancia atualizar(Distancia distancia) {
        return daoGenerico.atualizar(distancia);
    }

    public void remover(Distancia distancia) {
        daoGenerico.remove(distancia);
    }
}
