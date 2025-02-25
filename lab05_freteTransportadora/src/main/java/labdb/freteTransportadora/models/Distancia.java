package labdb.freteTransportadora.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public @Data class Distancia implements EntidadeBase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cidade origem;

    @ManyToOne
    private Cidade destino;

    private double distanciaKm;
}