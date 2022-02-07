package com.cursosdedesarrollo.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private Integer id;
    private String nombre;
    private String direccion;
}
