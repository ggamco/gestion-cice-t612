package com.ciceonline.gestioncice.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProfesorDTO {

    private Long id;
    private String nombre;
    private String email;

}
