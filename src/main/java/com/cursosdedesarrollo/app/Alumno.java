package com.cursosdedesarrollo.app;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Alumno {
    private Integer id;
    private String nombre;
    private String direccion;
}
