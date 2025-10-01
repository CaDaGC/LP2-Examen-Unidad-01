package com.example.examen.mappers;

import com.example.examen.dto.ColaboradorDTO;
import com.example.examen.entity.Colaborador;
import com.example.examen.mappers.base.BaseMappers;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColaboradorMapper extends BaseMappers<Colaborador, ColaboradorDTO> {
}
