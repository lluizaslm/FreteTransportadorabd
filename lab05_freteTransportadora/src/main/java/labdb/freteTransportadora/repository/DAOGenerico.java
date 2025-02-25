package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import labdb.freteTransportadora.models.EntidadeBase;

import java.util.List;
import java.util.Objects;

class DAOGenerico<T extends EntidadeBase> {

    private final EntityManager manager;

    DAOGenerico(EntityManager manager) {
        this.manager = manager;
    }

    List<T> buscarTodos(Class<T> clazz) {
        TypedQuery<T> query = manager.createQuery("SELECT t FROM " + clazz.getSimpleName() + " t", clazz);
        return query.getResultList();
    }

    T buscaPorId(Class<T> clazz, Integer id) {
        return manager.find(clazz, id);
    }

    T salvar(T t) {
        if (Objects.nonNull(t.getId())) {
            throw new IllegalArgumentException("A entidade já possui um ID. Use atualizar em vez de salvar.");
        }
        manager.persist(t);
        return t;
    }

    T atualizar(T t) {
        if (Objects.isNull(t.getId())) {
            throw new IllegalArgumentException("A entidade não possui um ID. Use salvar em vez de atualizar.");
        }
        return manager.merge(t);
    }

    void remove(T t) {
        manager.remove(t);
        manager.flush();
    }
}
