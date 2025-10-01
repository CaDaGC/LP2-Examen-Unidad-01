package com.example.examen.mappers;

import com.example.examen.dto.ProyectoDTO;
import com.example.examen.entity.Proyecto;
import com.example.examen.mappers.base.BaseMappers;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ParticipaMapper.class})
public interface ProyectoMapper extends BaseMappers<Proyecto, ProyectoDTO> {
    @Mapping(source = "cliente.id", target = "clienteId")
    @Mapping(source = "participas", target = "participas")
    ProyectoDTO toDTO(Proyecto proyecto);

    @InheritInverseConfiguration
    Proyecto toEntity(ProyectoDTO proyectoDTO);
}
