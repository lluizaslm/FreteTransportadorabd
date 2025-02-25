package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
public @Data class Veiculo implements EntidadeBase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;

    @ManyToOne
    private TipoVeiculo tipoVeiculo;

    @ManyToOne
    private Filial filial;
}
