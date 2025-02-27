package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
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
