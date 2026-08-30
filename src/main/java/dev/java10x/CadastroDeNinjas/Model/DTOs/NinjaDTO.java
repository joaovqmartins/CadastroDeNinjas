package dev.java10x.CadastroDeNinjas.Model.DTOs;

import dev.java10x.CadastroDeNinjas.Model.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String imaUrl;
    private int idade;
    private String rank;
    private MissoesModel missoesModel;



}
