package labdb.freteTransportadora.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.repository.FreteRepository;

public class CreateFreteService {

    private final FreteRepository freteRepository;
    private final EntityManager entityManager;

    public CreateFreteService(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.freteRepository = new FreteRepository(entityManager);
    }

    public Frete executar(Frete frete) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Frete novoFrete = freteRepository.salvar(frete);
            transaction.commit();
            return novoFrete;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }
}
