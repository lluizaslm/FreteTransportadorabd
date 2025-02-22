package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import java.util.List;
@Entity
class Veiculo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;

    @ManyToOne
    private TipoVeiculo tipoVeiculo;

    @ManyToOne
    private Filial filial;
}
