package com.ciceonline.gestioncice.service;

import com.ciceonline.gestioncice.repository.entity.CursoEntity;

import java.util.List;

public interface CursoService {

    /**
     *
     * @return Deberia ser CursoDTO pero vamos a usar entity
     */
    List<CursoEntity> getAllCursos();
}
