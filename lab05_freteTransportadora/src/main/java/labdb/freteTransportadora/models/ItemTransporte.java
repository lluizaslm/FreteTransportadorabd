package labdb.freteTransportadora.models;

import jakarta.persistence.*;

@Entity
class ItemTransporte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private double peso;

    @ManyToOne
    private Frete frete;
}

