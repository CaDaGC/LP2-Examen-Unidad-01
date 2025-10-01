package com.example.examen.mappers;

import com.example.examen.dto.ClienteDTO;
import com.example.examen.entity.Cliente;
import com.example.examen.mappers.base.BaseMappers;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ClienteMapper extends BaseMappers<Cliente, ClienteDTO> {
}
