package com.example.examen.mappers;

import com.example.examen.dto.ParticipaDTO;
import com.example.examen.entity.Participa;
import com.example.examen.mappers.base.BaseMappers;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ParticipaMapper extends BaseMappers<Participa, ParticipaDTO> {
    @Mapping(source = "proyecto.id", target = "proyectoId")
    @Mapping(source = "colaborador.id", target = "colaboradorId")
    ParticipaDTO toDTO(Participa participa);

    @InheritInverseConfiguration
    Participa toEntity(ParticipaDTO participaDTO);
}
