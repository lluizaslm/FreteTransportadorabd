package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.ItemTransporte;

import java.util.List;

public class ItemTransporteRepository {

    private final EntityManager manager;
    private final DAOGenerico<ItemTransporte> daoGenerico;

    public ItemTransporteRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public ItemTransporte buscarPorId(Long id) {
        return daoGenerico.buscaPorId(ItemTransporte.class, id.intValue());
    }

    public List<ItemTransporte> buscarTodos() {
        return daoGenerico.buscarTodos(ItemTransporte.class);
    }

    public ItemTransporte salvar(ItemTransporte itemTransporte) {
        return daoGenerico.salvar(itemTransporte);
    }

    public ItemTransporte atualizar(ItemTransporte itemTransporte) {
        return daoGenerico.atualizar(itemTransporte);
    }

    public void remover(ItemTransporte itemTransporte) {
        daoGenerico.remove(itemTransporte);
    }
}
