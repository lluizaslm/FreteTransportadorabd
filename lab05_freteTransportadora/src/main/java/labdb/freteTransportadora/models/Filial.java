package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import java.util.List;
@Entity
class Filial {
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