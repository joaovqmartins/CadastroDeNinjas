package dev.java10x.CadastroDeNinjas.Model.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Model.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_da_missao")
    private String nomeDaMissao;

    @Column(name = "dificuldade")
    private String dificuldade;

    @JsonIgnore
    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninjas;


}
