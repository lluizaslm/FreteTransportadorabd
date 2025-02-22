package labdb.freteTransportadora.models;

import jakarta.persistence.*;


@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
}
