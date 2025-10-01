package com.example.examen.dto;

import com.example.examen.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProyectoDTO {

    private Long id;
    private String descripcion;
    private BigDecimal precio;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Long clienteId;
    private List<ParticipaDTO> participas;
}
