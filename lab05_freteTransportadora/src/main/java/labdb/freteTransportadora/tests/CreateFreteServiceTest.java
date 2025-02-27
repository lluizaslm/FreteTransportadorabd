package labdb.freteTransportadora.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import labdb.freteTransportadora.models.Frete;
import labdb.freteTransportadora.services.CreateFreteService;

public class CreateFreteServiceTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fretePU");
        EntityManager em = emf.createEntityManager();

        CreateFreteService service = new CreateFreteService(em);

        Frete frete = new Frete();
        // Configurar os atributos necessários do frete...

        Frete novoFrete = service.executar(frete);
        System.out.println("Frete criado com ID: " + novoFrete.getId());

        em.close();
        emf.close();
    }
}
