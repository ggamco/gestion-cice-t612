package com.ciceonline.gestioncice.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CursoEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    @OneToOne
    @JoinColumn(name = "aula_id")
    private AulaEntity aula;

    @OneToOne
    @JoinColumn(name = "profesor_id")
    private ProfesorEntity profesor;

    @OneToMany
    @JoinColumn(name = "alumno_id")
    private List<AlumnoEntity> alumnos;
}
