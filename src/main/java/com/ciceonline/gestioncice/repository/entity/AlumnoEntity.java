package com.ciceonline.gestioncice.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AlumnoEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String email;
}
