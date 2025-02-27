package labdb.freteTransportadora.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import labdb.freteTransportadora.models.CategoriaFrete;
import labdb.freteTransportadora.models.Distancia;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.repository.DistanciaRepository;

public class CalcularValorFreteService {

    private final EntityManager entityManager;
    private final DistanciaRepository distanciaRepository;

    public CalcularValorFreteService(EntityManager entityManager) {
        this.entityManager = entityManager;
        this.distanciaRepository = new DistanciaRepository(entityManager);
    }

    public double calcular(Frete frete) {
        Distancia distancia = buscarDistancia(frete.getOrigem().getId(), frete.getDestino().getId());
        if (distancia == null) {
            throw new IllegalArgumentException("Distância entre as cidades não cadastrada.");
        }

        CategoriaFrete categoria = frete.getCategoriaFrete();
        if (categoria == null) {
            throw new IllegalArgumentException("Categoria do frete não informada.");
        }

        return distancia.getDistanciaKm() * categoria.getPercentual();
    }

    private Distancia buscarDistancia(Long origemId, Long destinoId) {
        TypedQuery<Distancia> query = entityManager.createQuery(
                "SELECT d FROM Distancia d WHERE d.origem.id = :origemId AND d.destino.id = :destinoId",
                Distancia.class);
        query.setParameter("origemId", origemId);
        query.setParameter("destinoId", destinoId);

        return query.getResultStream().findFirst().orElse(null);
    }
}
