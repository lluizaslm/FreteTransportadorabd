package labdb.freteTransportadora.models;


import jakarta.persistence.*;

@Entity
class CategoriaFrete {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private double percentual;
}