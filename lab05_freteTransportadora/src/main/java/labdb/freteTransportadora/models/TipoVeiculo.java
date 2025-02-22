package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
class TipoVeiculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
}
