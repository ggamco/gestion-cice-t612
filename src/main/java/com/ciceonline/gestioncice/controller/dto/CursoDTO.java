package com.ciceonline.gestioncice.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CursoDTO {

    //private Long id;
    @JsonProperty
    private String nombre;
    //private AulaDTO aula;
    //private ProfesorDTO profesor;
    //private List<AlumnoDTO> alumnos;

}
