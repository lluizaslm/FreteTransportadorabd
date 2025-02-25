package labdb.freteTransportadora.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
public @Data class CategoriaFrete {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private double percentual;
}