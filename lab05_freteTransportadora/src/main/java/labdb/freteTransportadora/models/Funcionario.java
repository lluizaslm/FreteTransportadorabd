package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import java.util.List;
@Entity
class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
}
