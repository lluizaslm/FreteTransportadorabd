package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public @Data class Filial implements EntidadeBase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;

    @OneToOne
    private Funcionario responsavel;

    @OneToMany(mappedBy = "filial")
    private List<Veiculo> veiculos;
}