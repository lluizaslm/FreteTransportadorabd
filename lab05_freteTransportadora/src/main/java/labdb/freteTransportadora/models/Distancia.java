package labdb.freteTransportadora.models;

import jakarta.persistence.*;

@Entity
class Distancia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cidade origem;

    @ManyToOne
    private Cidade destino;

    private double distanciaKm;
}