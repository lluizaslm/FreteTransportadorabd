package labdb.freteTransportadora.services;

import jakarta.persistence.EntityManager;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.repository.FreteRepository;

public class BuscarFretePorIdService {

    private final FreteRepository freteRepository;

    public BuscarFretePorIdService(EntityManager entityManager) {
        this.freteRepository = new FreteRepository(entityManager);
    }

    public Frete executar(Long id) {
        Frete frete = freteRepository.buscarPorId(id);
        if (frete == null) {
            throw new IllegalArgumentException("Frete com ID " + id + " não encontrado.");
        }
        return frete;
    }
}
