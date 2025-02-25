package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public @Data class Cidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;
}
