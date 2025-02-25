package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
public @Data class Funcionario implements EntidadeBase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
}
