package com.ciceonline.gestioncice.controller;

import com.ciceonline.gestioncice.controller.dto.CursoDTO;
import com.ciceonline.gestioncice.repository.entity.CursoEntity;
import com.ciceonline.gestioncice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursosResource {

    @Autowired
    CursoService cursoService;

    @RequestMapping(path = "/cursos", method = RequestMethod.GET)
    public ResponseEntity<List<CursoEntity>> getAllCursos(){
        ResponseEntity<List<CursoEntity>> responseDTO = null;
        List<CursoEntity> cursos = cursoService.getAllCursos();
        responseDTO = ResponseEntity.ok(cursos);
        return responseDTO;
    }

}
