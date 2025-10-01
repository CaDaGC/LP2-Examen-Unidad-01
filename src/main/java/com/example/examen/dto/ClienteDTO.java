package com.example.examen.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {
    private Long id;
    private String telefono;
    private String domicilio;
    private String razon_social;
}
