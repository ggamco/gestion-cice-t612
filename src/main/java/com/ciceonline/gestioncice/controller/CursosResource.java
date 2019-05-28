package com.ciceonline.gestioncice.controller;

import com.ciceonline.gestioncice.controller.dto.CursoDTO;
import com.ciceonline.gestioncice.repository.entity.CursoEntity;
import com.ciceonline.gestioncice.service.CursoService;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.GenericArrayType;
import java.util.List;

@RestController
public class CursosResource {

    @Autowired
    CursoService cursoService;

    @RequestMapping(path = "/cursos", method = RequestMethod.GET)
    public ResponseEntity<List<CursoDTO>> getAllCursos(){
        /*ResponseEntity<List<CursoEntity>> responseDTO = null;
        List<CursoEntity> cursos = cursoService.getAllCursos();
        responseDTO = ResponseEntity.ok(cursos);*/

        String URI = "http://localhost:8080/productos";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseFromService = restTemplate.getForEntity(URI, String.class);
        String body = responseFromService.getBody();
        List<CursoDTO> listaCursos = new GsonBuilder()
                .create()
                .fromJson(body, new TypeToken<List<CursoDTO>>() {}.getType());

        return ResponseEntity.ok(listaCursos);
    }

    @RequestMapping(path = "/cursos/info", method = RequestMethod.GET)
    public ResponseEntity<String> getCursosInfo(){
        return ResponseEntity.ok("Todo OK");
    }

}
