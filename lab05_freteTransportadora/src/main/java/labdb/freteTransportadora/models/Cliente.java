package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
public @Data class Cliente implements EntidadeBase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
}
