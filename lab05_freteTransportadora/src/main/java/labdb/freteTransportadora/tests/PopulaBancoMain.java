package labdb.freteTransportadora.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import labdb.freteTransportadora.models.Cidade;
import labdb.freteTransportadora.models.Cliente;
import labdb.freteTransportadora.repository.CidadeRepository;
import labdb.freteTransportadora.repository.ClienteRepository;

import java.util.Arrays;
import java.util.List;

public class PopulaBancoMain {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("freteTransportadora");
        EntityManager manager = factory.createEntityManager();

        CidadeRepository cidadeRepository = new CidadeRepository(manager);
        ClienteRepository clienteRepository = new ClienteRepository(manager);

        manager.getTransaction().begin();

        // Criando cidades
        List<Cidade> cidades = Arrays.asList(
                new Cidade(null, "São Paulo", "SP"),
                new Cidade(null, "Rio de Janeiro", "RJ"),
                new Cidade(null, "Belo Horizonte", "MG"),
                new Cidade(null, "Curitiba", "PR"),
                new Cidade(null, "Porto Alegre", "RS")
        );

        cidades.forEach(cidadeRepository::salvar);

        // Criando clientes
        List<Cliente> clientes = Arrays.asList(
                new Cliente(null, "João Silva", "Rua A, 123", "11999999999"),
                new Cliente(null, "Maria Oliveira", "Rua B, 456", "11988888888"),
                new Cliente(null, "Carlos Souza", "Rua C, 789", "11977777777"),
                new Cliente(null, "Ana Costa", "Rua D, 101", "11966666666"),
                new Cliente(null, "Pedro Lima", "Rua E, 202", "11955555555")
        );

        clientes.forEach(clienteRepository::salvar);

        manager.getTransaction().commit();
        manager.close();
        factory.close();

        System.out.println("Cidades e clientes cadastrados com sucesso!");
    }
}
