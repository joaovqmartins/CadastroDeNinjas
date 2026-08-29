package dev.java10x.CadastroDeNinjas.Ninjas;

//TODO: Adicionar padrão de projeto.

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoesModel;



}
