package com.ciceonline.gestioncice.service.impl;

import com.ciceonline.gestioncice.repository.CursoRepository;
import com.ciceonline.gestioncice.repository.entity.CursoEntity;
import com.ciceonline.gestioncice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public List<CursoEntity> getAllCursos() {
        List<CursoEntity> cursos = null;
        cursos = cursoRepository.findAll();
        return cursos;
    }
}
