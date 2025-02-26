package labdb.freteTransportadora.repository;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Funcionario;

import java.util.List;

public class FuncionarioRepository {

    private final EntityManager manager;
    private final DAOGenerico<Funcionario> daoGenerico;

    public FuncionarioRepository(EntityManager manager) {
        this.manager = manager;
        this.daoGenerico = new DAOGenerico<>(manager);
    }

    public Funcionario buscarPorId(Long id) {
        return daoGenerico.buscaPorId(Funcionario.class, id.intValue());
    }

    public List<Funcionario> buscarTodos() {
        return daoGenerico.buscarTodos(Funcionario.class);
    }

    public Funcionario salvar(Funcionario funcionario) {
        return daoGenerico.salvar(funcionario);
    }

    public Funcionario atualizar(Funcionario funcionario) {
        return daoGenerico.atualizar(funcionario);
    }

    public void remover(Funcionario funcionario) {
        daoGenerico.remove(funcionario);
    }
}
