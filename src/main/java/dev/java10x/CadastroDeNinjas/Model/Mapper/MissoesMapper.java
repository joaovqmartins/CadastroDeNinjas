package dev.java10x.CadastroDeNinjas.Model.Mapper;

import dev.java10x.CadastroDeNinjas.Model.DTOs.MissoesDTO;
import dev.java10x.CadastroDeNinjas.Model.MissoesModel;

public class MissoesMapper {

    public MissoesModel map(MissoesDTO missoesDTO) {

        MissoesModel missoesModel = new MissoesModel();

        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNomeDaMissao(missoesDTO.getNomeDaMissao());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());

        return missoesModel;
    }

    public MissoesDTO map(MissoesModel missoesModel) {

        MissoesDTO missoesDTO = new MissoesDTO();

        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNomeDaMissao(missoesModel.getNomeDaMissao());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());

        return missoesDTO;
    }
}
