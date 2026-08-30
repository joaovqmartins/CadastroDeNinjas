package dev.java10x.CadastroDeNinjas.Model;

//TODO: Adicionar padrão de projeto.


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_cadastro")

@Getter
@Setter
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;


    @Column(name = "img_url")
    private String imaUrl;

    @Column(name = "rank")
    private String rank;

    @Column(name = "idade")
    private int idade;


    // @ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoesModel;



}
