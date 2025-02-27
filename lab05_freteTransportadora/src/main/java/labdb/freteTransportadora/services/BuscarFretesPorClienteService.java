package labdb.freteTransportadora.services;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Cliente;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.repository.FreteRepository;

import java.util.List;

public class BuscarFretesPorClienteService {

    private final FreteRepository freteRepository;

    public BuscarFretesPorClienteService(EntityManager entityManager) {
        this.freteRepository = new FreteRepository(entityManager);
    }

    public List<Frete> executar(Cliente cliente) {
        return freteRepository.buscarTodosPorCliente(cliente);
    }
}
