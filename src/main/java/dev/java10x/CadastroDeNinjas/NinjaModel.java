package dev.java10x.CadastroDeNinjas;

//TODO: Adicionar padrão de projeto.

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String aldeia;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
