package com.example.examen.dto;

import com.example.examen.entity.Colaborador;
import com.example.examen.entity.Proyecto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ParticipaDTO {
    private Long id;
    private Long proyectoId;
    private Long colaboradorId;
}
