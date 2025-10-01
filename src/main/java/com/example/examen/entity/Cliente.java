package com.example.examen.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="TBL_CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TELEFONO", unique = true, nullable = false, length = 15)
    private String telefono;

    @Column(name = "DOMICILIO", unique = true, nullable = false, length = 150)
    private String domicilio;

    @Column(name = "RAZON_SOCIAL", unique = true, nullable = false, length = 200)
    private String razon_social;
}
