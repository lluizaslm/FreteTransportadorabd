package labdb.freteTransportadora.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public @Data class Frete implements EntidadeBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private Cidade origem;

    @ManyToOne
    private Cidade destino;

    @ManyToOne
    private Funcionario responsavel;

    @OneToMany(mappedBy = "frete")
    private List<ItemTransporte> itens;

    @ManyToOne
    private CategoriaFrete categoriaFrete;
}